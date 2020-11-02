/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import entity.Good;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class GoodManager {
    private Scanner scanner = new Scanner(System.in);
    
    public Good createGood() {
        Good good = new Good();
        System.out.println("--- Создание Товара ---");
        System.out.print("Введите название овоща: ");
        good.setName(scanner.nextLine());
        System.out.print("Введите цену продутка: ");
        good.setPrice(scanner.nextInt());
        System.out.println("Добавлен продукт: "+ good.getName());
        return good;
    }
    public void addGoodToArray(Good good, List<Good> listGoods) {
        listGoods.add(good);
    }
    public void printListGoods(List<Good> listGoods) {
        for (int i = 0; i < listGoods.size(); i++) {
            if(listGoods.get(i) != null){
                System.out.println(i+1+". " + listGoods.toString());
            }
        }   
    }
}