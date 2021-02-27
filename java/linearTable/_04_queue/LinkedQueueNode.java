package linearTable._04_queue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LinkedQueueNode<E> {
    private LinkedQueueNode next;
    private E data;
    public LinkedQueueNode(E data){
        this.data = data;
        this.next = null;
    }
}
