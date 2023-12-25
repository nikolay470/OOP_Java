package DZ.seminar_3;

import java.util.*;

public class Flow implements Iterable<StudyGroup>{
    private final int MaxSizeFlow = 20;
    private ArrayList<StudyGroup> listGroup = new ArrayList<>(MaxSizeFlow);
    public Flow(List<StudyGroup> list) {
        Collections.copy(this.listGroup, list);
    }
    public Flow() {

    }
    public boolean addGroup(StudyGroup group) {
        if (this.listGroup.size() <= this.MaxSizeFlow) {
            this.listGroup.add(group);
            return true;
        }
        return false;
    }
    public Integer getQuantGroup() {
        return this.listGroup.size();
    }
    public ArrayList<StudyGroup> getListGroup() {
        return this.listGroup;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return new Iterator<StudyGroup>() {
            private int currentIndex = 0;
            private ArrayList<StudyGroup> list = listGroup;

            @Override
            public boolean hasNext() {
                if (currentIndex < list.size()) {
                    return true;
                }
                currentIndex = 0;
                return false;
            }
            @Override
            public StudyGroup next() {
                if(!hasNext()) {
                    throw new NoSuchElementException();
                } else {
                    return list.get(currentIndex++);
                }
            }
            @Override
            public void remove() {
                currentIndex--;
                list.remove(currentIndex);
                currentIndex++;
            }
        };
    }
    @Override
    public String toString() {
        return this.listGroup.toString();
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Flow) {
            Flow newObj = (Flow) obj;
            return this.listGroup.equals(newObj.listGroup);
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return (this.listGroup.hashCode() >> 2);
    }
}















