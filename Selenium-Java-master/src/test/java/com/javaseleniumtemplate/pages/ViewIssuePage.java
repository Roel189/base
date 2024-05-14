package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class ViewIssuePage extends PageBase {
    //Mapping
    By filterText = By.id("filter-search-txt");
    By editButton = By.xpath("//i[@title='Edit']");
    By filterButton = By.xpath("//input[@name='filter_submit']");
    By firstBugOnList = By.xpath("//*[@id='buglist']/tbody/tr[1]/td[4]");

    //Actions

    public void fillFilter(String filter){
        sendKeys(filterText, filter);
    }
    public void clickOnFirstBug(){click(firstBugOnList);}
    public void clickEdit(){
        click(editButton);
    }

    public void clickFilter(){
        click(filterButton);
    }
}
