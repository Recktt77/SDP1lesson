package ass3;

// Old API
class LegacyOrderProcessor {
    void processLegacyOrder() {
        System.out.println("Processing order using legacy system.");
    }
}
// New interface
interface NewOrderProcessor {
    void processNewOrder();
}
// Adapter class
class OrderAdapter implements NewOrderProcessor {
    private LegacyOrderProcessor legacyOrderProcessor;
    OrderAdapter(LegacyOrderProcessor legacyOrderProcessor) {
        this.legacyOrderProcessor = legacyOrderProcessor;
    }
    public void processNewOrder() {
        legacyOrderProcessor.processLegacyOrder(); // Adapting the old method to the new interface
    }
}
// Client code
public class MainAdapterTask {
    public static void main(String[] args) {
        LegacyOrderProcessor legacyProcessor = new LegacyOrderProcessor();
        NewOrderProcessor adapter = new OrderAdapter(legacyProcessor);
        adapter.processNewOrder(); // Working with the new interface while using old code
    }
}