# Try-Catch-Finally
Hata durumlarını yönetmek için 2 yöntem vardır.
- Try-catch blokları ile hatayı alınacağı tahmin edilen yerde kontrol altına alabiliriz veya
- Hatayı throws anahtar kelimesi ile çağrıldığı bir üst noktaya fırlatarak, çözümün orada yapılmasını zorunlu hale getiririz.

## "try-catch-finally" Mekanizması
Bu yöntemde öncelikle hata oluşacağı tahmin edilen ve izlenmesi gereken kod satırları "try" bloğu içerisine alınır. Hata oluşmadığı durumda buradaki istenilen işlemler tamamlanacak ve kod sorunsuz bir şekilde devam edecektir ancak hata oluştuğunda "catch" bloğuna düşecektir.

"catch" bloğu aldığımız hatayla nasıl baş edeceğimizi programladığımız bloktur. Bu yapı hatalarda programımızın nasıl davranacağını, kapatılacaksa bile gerekli verilerin kaydedilmesini ve programın bilinçli bir şekilde kapatılmasına veya sistemin hata durumlarıda gerekli önlemleri alarak çalışmasını sürdürmesini sağlar. Bu sayede yapacağımız uygulama daha kararlı bir şekilde çalışacaktır.

"try-catch" mekanizmasının kullanımı maliyetlidir. Bu nedenle, "try-catch" bloklarını gerekli yerlerde kullanmak gerekir.

"catch" bloklarının sıralaması önemlidir. Çünkü, sıralanmış haline göre işletilir.

Aynı zamanda Exception sınıfındaki hiyerarşik yapısında bulunan sıraya göre bu bloklar sıralanmalıdır.


"finally" Bloğu

"try-catch" sonrasında opsiyonel olarak "finally" kod bloğunu ekleyebilirsiniz. "try" bloğu içindeki kod bloğu hata alsın ya da almasın "finally" bloğu her koşulda çalıştırılır.Bunu bir örnekle açıklayalım.
```java
public int readIntFromKeyboard() {
    Scanner scanner = new Scanner(System.in);
// bu örnekte hatayı tespit ediyoruz ve oluştuğu noktada önlemler alıyoruz. 
    try {
        String inputFromKeyboard = scanner.nextLine();

        int number = Integer.parseInt(inputFromKeyboard);
        return number;
    } catch (Exception e) {
        e.printStackTrace();
    }
// hata olsun veya olmasın mutlaka çalıştırılır. 
    finally {
        scanner.close();
    }
    return -1;
}
```

Yukarıdaki örnekte "Scanner" sınıfından bir nesne üretiyoruz. Bu nesne klavyeden girilen değeri alıyor. Aldığımız değeri int tipinde bir sayıya dönüştürüyoruz. Bu dönüşüm esnasında bir hata olsun ya da olmasın "finally" bloğunda "Scanner" sınıfının dinlediği Stream'i close ediyoruz.