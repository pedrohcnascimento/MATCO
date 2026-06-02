package br.com.matco.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenericRepository<T> {
    private final List<T> items = new ArrayList<>();
    private long nextId = 1;

    public void save(T item) {
        // Assuming 'item' has a setId method if it's a new item
        // For simplicity, we'll just add it to the list for now
        // In a real scenario, you'd handle ID generation and assignment more robustly
        items.add(item);
        // A more robust ID assignment would involve reflection or an interface
        // For this simulation, we'll assume IDs are handled externally or not critical for basic CRUD
    }

    public List<T> findAll() {
        return new ArrayList<>(items);
    }

    public Optional<T> findById(String id) {
        // This would require a way to get the ID from T, e.g., an interface or reflection
        // For now, a placeholder implementation
        return items.stream()
                .filter(item -> item.toString().contains(id)) // Simplistic check
                .findFirst();
    }

    public void delete(T item) {
        items.remove(item);
    }
}
