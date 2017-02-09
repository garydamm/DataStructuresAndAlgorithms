package com.damm.datastructures;


import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by garydamm on 12/24/16.
 */
public class Vertex {

    private String label;
    private ArrayList<Edge> neighbors;

    public Vertex(String label) {
        this.label = label;
        this.neighbors = new ArrayList<Edge>();
    }

    public ArrayList<Edge> getNeighbors() {
        return new ArrayList<Edge>(neighbors);
    }

    public String getLabel() {
        return label;
    }

    public void addNeighbor(Edge edge) {
        if (neighbors.contains(edge)) {
            return;
        }
        neighbors.add(edge);
    }

    public boolean containsNeighbor(Edge edge) {
        return neighbors.contains(edge);
    }

    public Edge getNeighbor(int index) {
        return neighbors.get(index);
    }

    public void removeNeighbor(Edge edge) {
        neighbors.remove(edge);
    }

    public int getNeighborCount() {
        return neighbors.size();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vertex{");
        sb.append("label='").append(label).append('\'');
        sb.append(", neighbors=").append(neighbors);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(label, vertex.label) &&
                Objects.equals(neighbors, vertex.neighbors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, neighbors);
    }
}
