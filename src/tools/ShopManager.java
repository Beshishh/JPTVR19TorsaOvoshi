/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import entity.Good;
import entity.Buyer;
import entity.History;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ShopManager {
    private Buyer buyer = new Buyer();
    private Good good = new Good();
    private History history = new History();
    private Scanner scanner = new Scanner(System.in);
    private BuyerManager buyerManager = new BuyerManager();
    private GoodManager goodManager = new GoodManager();
    public History buyGood(List<Good> listGoods, List<Buyer> listBuyers) {
        
        System.out.println("--- Список Покупателей ---");
            buyerManager.printListOfBuyers(listBuyers);
            System.out.print("Выберите номер покупателя: ");
            int buyerNumber = scanner.nextInt();
            scanner.nextLine();
            buyer = listBuyers.get(buyerNumber-1);
            history.getBuyer();
            goodManager.printListGoods(listGoods);
            System.out.print("Выберите номер товара: ");
            int goodNumber = scanner.nextInt();
            scanner.nextLine();
            good = listGoods.get(goodNumber-1);
            history.setGood(good);
            Calendar calendar = new GregorianCalendar();
            history.setBoughtDate(calendar.getTime());
            if (buyer.getWallet() < good.getPrice()){
                System.out.println("У покупателя недостаточно средств");
            }else{
                int newWallet = buyer.getWallet()-good.getPrice();
                buyer.setWallet(newWallet);
                listGoods.remove(good);
            }
        return history;
    }

    private void printHistory(History history) {
        System.out.printf("Товар \"%s %s\" продан %s %s%n"
                ,history.getGood().getName()
                ,history.getBuyer().getName()
                ,history.getBuyer().getLastname()
        );
    }
    public void printListOfBoughtGoods(List<History> listHistories){
        for (int i = 0; i < listHistories.size(); i++) {
            System.out.println(listHistories.get(i).toString());
        }
    }
    public void addHistoryToArray(History history, List<History> listHistory) {
        listHistory.add(history);
    }

}