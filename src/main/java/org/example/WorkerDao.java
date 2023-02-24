package org.example;

import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

public class WorkerDao implements Repository<Worker> {
    private final Session session;

    public WorkerDao(Session session) {
        this.session = session;
    }

    @Override
    public Worker create(Worker worker) {
        session.persist(worker);
        return worker;
    }

    @Override
    public List<Worker> getAll() {

        return null;
    }

    @Override
    public Optional<Worker> getById(int id) {
        return Optional.empty();
    }

    @Override
    public Worker update(Worker worker) {
        return null;
    }

    @Override
    public boolean removeById(int id) {
        return false;
    }

    @Override
    public boolean removeAll() {
        return false;
    }
}
