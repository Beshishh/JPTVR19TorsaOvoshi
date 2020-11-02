/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import entity.Good;
import entity.History;
import entity.Buyer;
import java.util.List;
import java.util.Scanner;
import tools.GoodManager;
import tools.ShopManager;
import tools.BuyerManager;
import savers.GoodSaver;
import savers.HistorySaver;
import savers.BuyerSaver;

/**
 *
 * @author User
 */
public class UI {
    private GoodManager goodManager = new GoodManager();
    private BuyerManager buyerManager = new BuyerManager();
    private ShopManager shopManager = new ShopManager();
    private GoodSaver goodSaver = new GoodSaver();
    private BuyerSaver buyerSaver = new BuyerSaver();
    private HistorySaver historySaver = new HistorySaver();
    
    public void getUI(List<Buyer> listBuyers, List<Good> listGoods, List<History> listHistories){
        boolean repeat = true;
        do{
            System.out.println("Задачи: ");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить новый товар");
            System.out.println("2. Список товаров");
            System.out.println("3. Зарегистрировать покупателя");
            System.out.println("4. Список покупателей");
            System.out.println("5. Продать товар покупателю");
            System.out.println("6. Список проданных товаров");
            System.out.print("Выберите задачу: ");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.nextLine();
            switch (task) {
                case "0":
                    System.out.println("--- конец программы ---");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("--- Добавить новый товар ---");
                    Good good = goodManager.createGood();
                    goodManager.addGoodToArray(good,listGoods);
                    goodSaver.saveGoods(listGoods);
                    break;
                case "2":
                    System.out.println("--- Список товаров ---");
                    goodManager.printListGoods(listGoods);
                    break;
                case "3":
                    System.out.println("--- Зарегистрировать покупателя ---");
                    Buyer buyer = buyerManager.createBuyer();
                    buyerManager.addBuyerToArray(buyer,listBuyers);
                    buyerSaver.saveBuyers(listBuyers);
                    break;
                case "4":
                    System.out.println("--- Список покупателей ---");
                    buyerManager.printListOfBuyers(listBuyers);
                    break;
                case "5":
                    System.out.println("--- Выдать книгу читателю ---");
                    History history = shopManager.buyGood(listGoods, listBuyers);
                    shopManager.addHistoryToArray(history,listHistories);
                    historySaver.saveHistories(listHistories);
                    break;
                case "6":
                    System.out.println("--- Список проднных товаров  ---");
                    shopManager.printListOfBoughtGoods(listHistories);
                    break;
                default:
                    System.out.println("Нет такой задачи.");
            }
        }while(repeat);
    }
}