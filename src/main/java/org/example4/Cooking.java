package org.example4;

public class Cooking {
    public Cook makeCook(MenuItem menuItem) {
        // 메뉴(menuItem)을 전달받아 요리(Cook)를 리턴함

        Cook cook = new Cook(menuItem);

        return cook;
    }
}
