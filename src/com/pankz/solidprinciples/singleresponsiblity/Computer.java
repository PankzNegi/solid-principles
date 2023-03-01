package com.pankz.solidprinciples.singleresponsiblity;

public class Computer {
   private String groupId;
//    private int inventory;
//    public List<String> getRamOptions()
//    {
//        return null;
//    }
//    public void deliverComputer() //Does computer class need to know how it is delieverd??
//    {
//
//    }
//    public  void setInventory(int inventory)   //Does computer class need to know how much inventory does it has?
//    {
//        this.inventory=inventory;
//    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
//Because ideally this computer classwould just contain info. about products that is being sold
//When we look at computer class we don't think about this responiblity
//Computer class forces the developer to implements its own implementaion of managing inventory,delevering computers e.t.c
//If store grows then more products are offered,we will have very similar methods for these products.
//Therefore one should delegate this responsiblities to other classes.
//Make isolated classes,reduces the chances of merge conflicts.
//If application grows with new products  changes can be made to these separate classes