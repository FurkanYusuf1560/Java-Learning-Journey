package IntroductionToJava;
import java.util.*;

public class Day_8 {
    static Scanner inp = new Scanner(System.in);
    static ArrayList<String> tasklar = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--------------MENU-------------");
            System.out.println("1- Task ekle");
            System.out.println("2- Task sil");
            System.out.println("3- Task listele");
            System.out.println("4- Çıkış");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");

            // Sayısal olmayan girişleri engellemek için basit bir kontrol eklenebilir
            if (!inp.hasNextInt()) {
                System.out.println("Lütfen sadece rakam giriniz!");
                inp.nextLine(); // Hatalı girişi temizle
                continue;
            }

            int secim = inp.nextInt();
            inp.nextLine(); // Kritik tampon temizliği

            switch (secim) {
                case 1 -> taskEkle();
                case 2 -> taskSil();
                case 3 -> taskListele();
                case 4 -> cıkıs();
                default -> System.out.println("Lütfen menüde olan bir seçeneği seçiniz!");
            }
        }
    }

    private static void taskEkle() {
        System.out.print("Lütfen Task giriniz : ");
        String yeniTask = inp.nextLine();
        tasklar.add(yeniTask);
        System.out.println("Task başarıyla eklendi.");
    }

    private static void taskSil() {
        System.out.print("Silmek istediğiniz taskın adını tam yazınız: ");
        String silinecek = inp.nextLine();

        // equals() kullanarak içerik kontrolü yapıyoruz
        // removeIf kullanımı döngü hatalarını önler ve daha moderndir
        boolean silindiMi = tasklar.removeIf(task -> task.equals(silinecek));

        if (silindiMi) {
            System.out.println("Task başarıyla silindi.");
        } else {
            System.out.println("Böyle bir task bulunamadı!");
        }
    }

    private static void taskListele() {
        if (tasklar.isEmpty()) {
            System.out.println("Listeniz şu an boş.");
        } else {
            System.out.println("--- Görev Listeniz ---");
            for (int i = 0; i < tasklar.size(); i++) {
                System.out.println((i + 1) + ". " + tasklar.get(i));
            }
        }
    }

    private static void cıkıs() {
        System.out.println("Programdan çıkılıyor... Hoşça kalın!");
        System.exit(0); // Programı tamamen kapatır
    }
}