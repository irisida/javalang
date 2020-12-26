package com.irisida.lang.projects.rockpaperscissors.game.gameobjects;

import java.util.Objects;

public class GameObject implements Comparable<GameObject> {
    private int id;
    private String name;

    // ---------- rock, paper, scissors,
    // rock ----- 0, -1, 1,
    // paper ---- 1, 0, -1,
    // scissors - -1, 1, 0,
    //

    private int[][] comparison = { { 0, -1, 1 }, { 1, 0, -1 }, { -1, 1, 0 }, };

    @Override
    public int compareTo(GameObject other) {
        /*
         * Takes two ids, the objectId and the Id of the object to compare it to. This
         * provides a coordinate to lookup in the table of outcomes. It works in the
         * form of rows and columns. The return integer at that position will hold the
         * value for the comparison of the two objects where a -1 is a loss, a zero is a
         * draw and a 1 is a win.
         */
        return comparison[id][other.id];
    }

    protected int getId() {
        return this.id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected GameObject id(int id) {
        this.id = id;
        return this;
    }

    protected GameObject name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " id:" + getId() + ", name:" + getName() + "}";
    }

    public GameObject() {
    }

    public GameObject(int id, String name, int[][] comparison) {
        this.id = id;
        this.name = name;
        this.comparison = comparison;
    }

    public int[][] getComparison() {
        return this.comparison;
    }

    public void setComparison(int[][] comparison) {
        this.comparison = comparison;
    }

    public GameObject comparison(int[][] comparison) {
        this.comparison = comparison;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GameObject)) {
            return false;
        }
        GameObject gameObject = (GameObject) o;
        return id == gameObject.id && Objects.equals(name, gameObject.name)
                && Objects.equals(comparison, gameObject.comparison);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, comparison);
    }

}
