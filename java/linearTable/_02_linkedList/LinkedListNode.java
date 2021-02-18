package linearTable._02_linkedList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LinkedListNode<E> {
    private E data;
    private LinkedListNode next;
}
