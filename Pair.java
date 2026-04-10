// PairTest.java
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" + "key=" + key + ", value=" + value + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Pair)) return false;
        Pair<?, ?> other = (Pair<?, ?>) obj;
        return key.equals(other.key) && value.equals(other.value);
    }

    @Override
    public int hashCode() {
        return key.hashCode() ^ value.hashCode();
    }

    // Testing inside the same file
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Ələmdar", 75);
        Pair<String, String> country = new Pair<>("Azerbaijan", "Baku");

        System.out.println(student);   // Pair{key=Ələmdar, value=75}
        System.out.println(country);   // Pair{key=Azerbaijan, value=Baku}

        Pair<String, Integer> student2 = new Pair<>("Ələmdar", 75);
        System.out.println("student equals student2? " + student.equals(student2));
    }
}
