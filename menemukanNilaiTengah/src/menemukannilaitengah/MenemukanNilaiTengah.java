/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menemukannilaitengah;

/**
 *
 * @author USER
 */
public class MenemukanNilaiTengah {
    Node head;
    static class Node{
        int data;
        Node next;
        
        Node (int d){
            data = d;
            next = null;
        }
    }
    private void melihatItem(MenemukanNilaiTengah l){
        l.head = new Node(10);
        Node nodDua = new Node(16);
        Node nodTiga = new Node(23);
        Node nodEmpat = new Node(33);
        Node nodLima = new Node(45);
        //Node nodEnam = new Node(67);
        l.head.next = nodDua;
        l.head.next.next = nodTiga;
        l.head.next.next.next = nodEmpat;
        l.head.next.next.next.next = nodLima;
        //l.head.next.next.next.next.next = nodEnam;
    }
    
    private void mencetak(String ini){
        System.out.println(ini);
        Node listNode = head;
        while (listNode != null){
            System.out.print(listNode.data +" ");
            listNode = listNode.next;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        MenemukanNilaiTengah l = new MenemukanNilaiTengah();
        l.melihatItem(l);
        l.mencetak("inisial item");
        l.pertengahamDua();
        l.pertengahan();
    }
    private void pertengahamDua(){
        Node cepat = head;
        Node lambat = head;
        if(head != null){
            while (cepat != null&&cepat.next!=null){
                cepat = cepat.next.next;
                lambat = lambat.next;
            }
            System.out.println("pertengahan Node = "+ lambat.data);
        }
    }
    private void pertengahan(){
        int c =0;
        Node tengah = head;
        while ( head !=null){
            if(c %2==1)
                tengah = tengah.next;
            c++;
            head = head.next;
        }
        if(tengah != null){
            System.out.println("data node tengah ="+ tengah.data);
        }
    }  
}
