/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19torsaovoshi;

import savers.HistorySaver;
import savers.BuyerSaver;
import savers.GoodSaver;
import tools.ShopManager;
import tools.BuyerManager;
import tools.GoodManager;
import entity.History;
import entity.Buyer;
import entity.Good;
import java.util.ArrayList;
import java.util.List;
import tools.UI;

/**
 *
 * @author pupil
 */
public class App {
    private List<Good> listGoods = new ArrayList<>();
    private List<Buyer> listBuyers = new ArrayList<>();
    private List<History> listHistories = new ArrayList<>();
    
    private Good[] goods = new Good[10];
    private Buyer[] buyers = new Buyer[10];
    private History[] histories = new History[10];
    
    private GoodManager goodManager = new GoodManager();
    private BuyerManager buyerManager = new BuyerManager();
    private ShopManager shopManager = new ShopManager();
    
    private GoodSaver goodSaver = new GoodSaver();
    private BuyerSaver buyerSaver = new BuyerSaver();
    private HistorySaver historySaver =  new HistorySaver();
    
    public App(){
        listGoods = goodSaver.loadGoods();
        listBuyers = buyerSaver.loadBuyers();
        listHistories = historySaver.loadHistories();
    }
    public void run() {
        boolean repeat = true;
        System.out.println("Магазин овощей");
        UI UI = new UI();
        UI.getUI(listBuyers, listGoods, listHistories);
        
       
    }
}

