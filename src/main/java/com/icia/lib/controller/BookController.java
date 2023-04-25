package com.icia.lib.controller;

import com.icia.lib.dto.BookDTO;
import com.icia.lib.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    // BookService 의존성 주읩(필드주입)
    @Autowired
    private BookService bookService;
    // 도서 등록 화면
    @GetMapping("/save")
    public String saveForm() {
        return "save";
    }
    // 도서 등록 처리
    @PostMapping("/save")
    public String save(@ModelAttribute BookDTO bookDTO, Model model) {
        int saveResult = bookService.save(bookDTO);
        model.addAttribute("result", saveResult);
        return "saveResult";
    }
    @GetMapping("/list")
    public String findAll(Model model) {
        List<BookDTO> bookDTOList = bookService.findAll();
        for(BookDTO bookDTO : bookDTOList) {
            System.out.println("bookDTO = " + bookDTO);
        }
        model.addAttribute("bookList", bookDTOList);
        return "list";
    }
    @GetMapping("/detail")
    public String findById(@RequestParam("id") Long id, Model model) {
        System.out.println("id = " + id + ", model = " + model);
        BookDTO bookDTO = bookService.findById(id);
        model.addAttribute("book", bookDTO);
        return "detail";
    }
}
