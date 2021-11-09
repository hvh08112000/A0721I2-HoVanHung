package ss11_dsa_stack_queue.bai_tap.trien_khai_queue_dung_lien_ket_vong;

public class Test {
    public static void main(String args[]) {
        Queue  q = new Queue();

        // Inserting elements in Circular Queue
        q.enQueue(14);
        q.enQueue(22);
        q.enQueue(6);

        // Display elements present in Circular Queue
        q.displayQueue();

        // Deleting elements from Circular Queue
        System.out.println("Deleted value = " + q.deQueue());
        System.out.println("Deleted value = " + q.deQueue());

        // Remaining elements in Circular Queue
        q.displayQueue();;

        q.enQueue(9);
        q.enQueue(20);
        q.displayQueue();
    }
}
