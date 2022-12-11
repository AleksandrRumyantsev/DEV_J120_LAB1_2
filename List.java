package Lab3_1;
//Реализация одно связного списка

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public  class List <T> implements  Iterable{
        private LinkList head;
        public List() {
            head = null;
        }

        public void addFirstValue(T value){ //добавление значения в начало списка!

            LinkList temp = head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            LinkList temp2 = new LinkList(value);
            temp.next = temp2;
        }
        public T getFirstValue(){  //извлечение значения из начала списка без его удаления из списка!
            LinkList temp = head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            return (T) temp.value;
        }
        public T getFirstValueAndDel(){  //извлечение значения из начала списка с удалением из списка!
            LinkList temp = head;
            LinkList temp2 = head;
            T res;
            while (temp.next!=null) {
                temp2=temp;
                temp=temp.next;
            }
            temp2.next=null;
            res = (T) temp.value;
            return (res);
        }
        public  T getLastValue(){  //извлечение значения из конца списка без его удаления!
            LinkList temp = head;
            return (T) temp.value;
        }
        public  T getLastValueAndDel(){  //извлечение значения из конца списка с удалением!
            LinkList temp = head;
            T res = (T) temp.value;
            temp = temp.next;
            head = temp;
            return res;
        }

        //Проверка пустой список или нет!
        private boolean isEmpty(){
            return head==null;
        }

        public void addLastValue(T value){     //добавление значения в конец списка!
            LinkList temp = new LinkList(value);
            temp.next = head;
            head = temp;
        }
        public void print(){   //Печать списка
            LinkList temp = head;
            while (temp!=null){
                System.out.println(temp.value);
                temp=temp.next;
            }
        }
        public boolean isContainsValue (T value){ //Проверка содержит ли список передаваемое значение...
            boolean res = false;
            LinkList temp = head;
            while (temp!=null){
                if (temp.value==value){res=true;}
                temp=temp.next;
            }
             return res;
        }
        public void findAndDel (T value){ //Найти элемент и удалить.
            LinkList temp = head;
            LinkList temp2 = head;
            while (temp!=null&&temp.value!=value) {
                temp2=temp;
                temp=temp.next;
                }
            if (temp!=null){
                if (temp==head){
                    head = head.next;
                }else {
                    temp2.next = temp.next;
                }
            }
        }

    @Override
    public Iterator <T> iterator() {

            return new LinkedIterator<>(head);
    }

    private static class LinkedIterator <T> implements Iterator<T>{
        LinkList nextNode;

        public LinkedIterator (LinkList nextNode){
            this.nextNode=nextNode;
        }

        @Override
        public boolean hasNext() {
            if(nextNode!=null) return true;
            return false;
        }

        @Override
        public T next() {
            T value = (T) nextNode.value;
            nextNode=nextNode.next;
            return value;
        }
    }
    public static class LinkList <T>{
            public T value;
            public LinkList next;

            public LinkList(T value) {
                this.value = value;
            }
        }
    }
