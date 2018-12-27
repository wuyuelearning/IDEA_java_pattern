package patterns.composite.simple;

import java.util.List;

public class File extends Dir {
    public File(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        throw new UnsupportedOperationException("no addDir");
    }

    @Override
    public void removeDir(Dir dir) {
        throw new UnsupportedOperationException("no removeDir");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("no clear");
    }

    @Override
    public void print() {
        System.out.print(getName());
    }

    @Override
    public List<Dir> getDirs() {
        throw new UnsupportedOperationException("no getDirs");
    }
}
