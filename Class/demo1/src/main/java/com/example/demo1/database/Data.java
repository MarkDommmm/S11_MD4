package com.example.demo1.database;

import com.example.demo1.Model.Computer;

import java.util.ArrayList;
import java.util.List;

public class Data {
   private  static  final   List<Computer> computerList = new ArrayList<>();

   static{
        initData();
   }
    private static  void initData(){
        computerList.add(new Computer(1, "SuperBook X1", 999.99, 2022, "Powerful laptop for gaming and creative work."));
        computerList.add(new Computer(2, "ProDesk Y2021", 799.50, 2021, "High-performance desktop for professionals."));
        computerList.add(new Computer(3, "Multitab Z3", 499.00, 2023, "Versatile tablet for entertainment and productivity."));
        computerList.add(new Computer(4, "SlimBook Ultra", 1299.75, 2022, "Ultra-slim laptop with premium design."));
        computerList.add(new Computer(5, "EliteDesk S450", 899.25, 2021, "Business desktop with top-notch specs."));
        computerList.add(new Computer(6, "KidsTab Fun", 299.99, 2023, "Kid-friendly tablet for learning and play."));
        computerList.add(new Computer(7, "EverydayBook 500", 799.00, 2022, "Reliable laptop for everyday tasks."));
        computerList.add(new Computer(8, "HomeDesk 2021", 699.00, 2021, "Home desktop for general family use."));
        computerList.add(new Computer(9, "MiniTab Nano", 199.50, 2023, "Compact tablet for on-the-go use."));
        computerList.add(new Computer(10, "UltimaBook Pro", 1499.00, 2022, "High-end laptop with cutting-edge features."));

    }

public static List<Computer> queryComputerList(){ return  computerList; }

}
