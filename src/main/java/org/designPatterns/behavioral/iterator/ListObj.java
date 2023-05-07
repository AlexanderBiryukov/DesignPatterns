package org.designPatterns.behavioral.iterator;

public class ListObj implements Container {
    private Object[] objects;

    public ListObj(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public Iterator getIterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator {
        private int index;

        @Override
        public Boolean hasNext() {
            return index < objects.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return objects[index++];
            }
            return null;
        }
    }
}
