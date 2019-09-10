package com.kodilla.good.patterns.food2Door2;

public class Producer implements ProducerOrder{
    private String name;

    public Producer(String name) {
        this.name = name;
    }
    @Override
    public void process(Product product, int volume){
        System.out.println("Health information: ");
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producer)) return false;

        Producer producer = (Producer) o;

        return getName().equals(producer.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public String toString() {
        return "Producer{" +
                "name='" + name + '\'' +
                '}';
    }
}
