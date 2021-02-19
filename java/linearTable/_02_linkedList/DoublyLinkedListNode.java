package linearTable._02_linkedList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoublyLinkedListNode<E> {
    private DoublyLinkedListNode pre;
    private DoublyLinkedListNode next;
    private E data;
}
