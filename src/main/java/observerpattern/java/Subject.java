package observerpattern.java;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Subject {
    PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void addObserver(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }

    public void removeObserver(PropertyChangeListener listener){
        support.removePropertyChangeListener(listener);
    }

    public void add(String message){
        support.firePropertyChange("eventName", null, message);
    }

}
