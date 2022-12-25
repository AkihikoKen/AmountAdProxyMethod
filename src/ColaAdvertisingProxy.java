public class ColaAdvertisingProxy implements Advertising { //наш Заместитель
    Advertising advertising = new ColaAdvertising();
    private int ammountAds = 0; //переменная для хранения количества показов

    public void HowMuchAds() //метод, принтующий количество показа
    {
        System.out.println("Пользователю показано рекламы: " + ammountAds);
    }
    @Override
    public void showAd() {
        advertising.showAd();
        ammountAds = ammountAds + 1;
    }
}
