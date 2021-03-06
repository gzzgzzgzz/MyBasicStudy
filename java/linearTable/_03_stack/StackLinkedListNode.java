package linearTable._03_stack;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StackLinkedListNode<E> {
    private E data;
    private StackLinkedListNode<E> next;
    public StackLinkedListNode(E e){
        this.data = e;
    }
}
