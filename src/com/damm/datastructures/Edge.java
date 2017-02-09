package com.damm.datastructures;

import java.util.Objects;

/**
 * Created by garydamm on 12/24/16.
 */
public class Edge implements Comparable<Edge> {

    private Vertex one;
    private Vertex two;

    private int weight;

    public Edge(Vertex one, Vertex two, int weight) {
        this.one = one;
        this.two = two;
        this.weight = weight;
    }

    public Edge(Vertex one, Vertex two) {
        this(one, two, 1);
    }

    public Vertex getNeighbor(Vertex vertex) {
        if (!(vertex.equals(one)) || vertex.equals(two)) {
            return null;
        }
        return (vertex.equals(one)) ? two : one;
    }

    public Vertex getTwo() {
        return two;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertex getOne() {
        return one;
    }

    @Override
    public int compareTo(Edge edge) {
        return weight - edge.weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Edge{");
        sb.append("one=").append(one);
        sb.append(", two=").append(two);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return weight == edge.weight &&
                Objects.equals(one, edge.one) &&
                Objects.equals(two, edge.two);
    }

    @Override
    public int hashCode() {
        return Objects.hash(one, two, weight);
    }
}
