import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Havuz {
    private List<Musluk> musluklar;

    public Havuz() {
        musluklar = new List<>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Musluk> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Musluk musluk) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Musluk> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Musluk> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Musluk get(int index) {
                return null;
            }

            @Override
            public Musluk set(int index, Musluk element) {
                return null;
            }

            @Override
            public void add(int index, Musluk element) {

            }

            @Override
            public Musluk remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Musluk> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Musluk> listIterator(int index) {
                return null;
            }

            @Override
            public List<Musluk> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

    }

    public void muslukEkle(Musluk musluk){
        musluklar.add(musluk);

    }

    public double problemiCoz(){
        double sonuc= 0.0;
        for (Musluk musluk:musluklar) {
            sonuc+=1.0/musluk.getSure();
        }
        return sonuc>0?Math.pow(sonuc,-1):sonuc;
    }


}
