package com.example.test1228.page.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // 관리자 페이지 시작
    @GetMapping("/")
    public String login(){
        return "login";
    }

    // 로그인 후 이동하는 페이지
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    // 카테고리 리스트
    @GetMapping("/categoryList")
    public String categoryList(){
        return "categorylist";
    }
    // 사용자 리스트
    @GetMapping("/customerList")
    public String customerList(){
        return "customerlist";
    }
    // 제품 리스트
    @GetMapping("/productList")
    public String productList(){
        return "productlist";
    }
    // 제품 작성
    @GetMapping("/addProduct")
    public String addProduct(){
        return "addproduct";
    }
    // 판매 시각 설정
    @GetMapping("/selltimeList")
    public String selltimeList(){
        return "selltimelist";
    }
    // 판매 시간 설정하기
    @GetMapping("/addSelltime")
    public String addSellTime(){
        return "addselltime";
    }
    // 주문리스트
    @GetMapping("/orderList")
    public String orderList(){
        return "orderlist";
    }
}
