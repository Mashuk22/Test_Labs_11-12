package test;

import page.*;
import org.testng.annotations.Test;

public class NikeTest extends CommonConditions {
    @Test(description = "Поиск всех мужских фиолетовых футболок для бега")
    public void NikeTest1(){
        new HomePage(driver).openPage()
                .acceptCookie()
                .searchQuery("tshirt")
                .setPurpleColorFilter()
                .setMenFilter()
                .setRunningFilter();
    }

    @Test(description = "Поиск самых дешевых носков со скидкой больше 40%")
    public void NikeTest2(){
        new HomePage(driver).openPage()
                .chooseUSACountryChoosePopUp()
                //.acceptCookie()
                .openSalePage()
                .set40OffFilter()
                .socksFilter()
                .sortOptions()
                .sortLowHigh()
                .openFirstItem();
    }

    @Test(description = "Поиск зеленых вещей со скидкой, предназначенных для бега в холодную погоду")
    public void NikeTest3(){
        new HomePage(driver).openPage()
                //.chooseUSACountryChoosePopUp()
                .acceptCookie()
                .selectNewAndFituredPage()
                .openNewPage()
                .wetConditionsFilter()
                .setGreenColorFilter()
                .openFirstItem();
    }

    @Test(description = "Определение необходимого размера детской панамы для размера головы 55 см")
    public void NikeTest4(){
        new HomePage(driver).openPage()
                //.chooseUSACountryChoosePopUp()
                .acceptCookie()
                .selectKidsCategory()
                .openKidsPage()
                .setBucketFilter()
                .openFirstItem();
    }
    @Test(description = "Поиск самых новых Apple watch Nike")
    public void NikeTest5(){
        new HomePage(driver).openPage()
                //.chooseUSACountryChoosePopUp()
                .acceptCookie()
                .selectMenCategory()
                .openMenPage()
                .setWatchFilter()
                .sortOptions()
                .sortNewest()
                .openFirstItem();
    }

    @Test(description = "Поиск самых дорогих тенисных кроссовок")
    public void NikeTest6(){
        new HomePage(driver).openPage()
                //.chooseUSACountryChoosePopUp()
                .acceptCookie()
                .selectWomenCategory()
                .openWomenTennisPage()
                .sortOptions()
                .sortHighLow()
                .openFirstItem();
    }

    @Test(description = "Поиск розовых вещей, предназначенных для повседневной носки")
    public void NikeTest7(){
        new HomePage(driver).openPage()
                //.chooseUSACountryChoosePopUp()
                .acceptCookie()
                .selectNewAndFituredPage()
                .openNewPage()
                .setLifestyleFilter()
                .setPinkColorFilter()
                .openFirstItem();
    }

    @Test(description = "Поиск самых дорогих новых кроссовок на скидке")
    public void NikeTest8(){
        new HomePage(driver).openPage()
                //.chooseUSACountryChoosePopUp()
                .acceptCookie()
                .openSalePage()
                .selectShoes()
                .sortOptions()
                .sortHighLow()
                .openFirstItem();
    }

    @Test(description = "Поиск красных мужских кастомных кроссовок Air Force 1")
    public void NikeTest9(){
        new HomePage(driver).openPage()
                .acceptCookie()
                .searchQuery("Air force 1 custom")
                .setRedColorFilter()
                .setMenFilter();
    }

    @Test(description = "Добавление женских черных носков для тениса размера XL в корзину")
    public void NikeTest10(){
        new HomePage(driver).openPage()
                .acceptCookie()
                .selectWomenCategory()
                .openWomenSocksPage()
                .setBlackColorFilter()
                .openFirstItem()
                .selectXL()
                .addToBag();
    }

}
