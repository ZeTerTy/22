public class TestCache {
    public static void main(String[] args) {
        System.out.println("=== Тестирование кэша строк ===");
        testStringCache();
        
        System.out.println("\n=== Тестирование кэша целых чисел ===");
        testIntegerCache();
    }
    
    public static void testStringCache() {
        Cache<String> cache = new Cache<>(3);
        
        cache.add("Первый");
        cache.add("Второй");
        cache.add("Третий");
        System.out.println("После добавления 3 элементов: " + cache);
        
        cache.add("Четвертый");
        System.out.println("После добавления четвертого: " + cache);
        
        System.out.println("Есть 'Второй'? " + cache.exists("Второй"));
        System.out.println("Есть 'Первый'? " + cache.exists("Первый"));
        
        System.out.println("Первый элемент: " + cache.getFirst());
        System.out.println("Последний элемент: " + cache.getLast());
        
        System.out.println("Элемент с индексом 0: " + cache.getItemByIndex(0));
        System.out.println("Элемент с индексом 5: " + cache.getItemByIndex(5));
        
        System.out.println("Удаляем 'Второй': " + cache.remove("Второй"));
        System.out.println("После удаления: " + cache);
    }
    
    public static void testIntegerCache() {
        Cache<Integer> cache = new Cache<>(4);
        
        for (int i = 1; i <= 5; i++) {
            cache.add(i * 10);
            System.out.println("После добавления " + (i * 10) + ": " + cache);
        }
        
        System.out.println("Первый элемент: " + cache.getFirst());
        System.out.println("Последний элемент: " + cache.getLast());
        System.out.println("Элемент с индексом 2: " + cache.getItemByIndex(2));
        System.out.println("Есть число 30? " + cache.exists(30));
        System.out.println("Есть число 10? " + cache.exists(10));
    }
}

