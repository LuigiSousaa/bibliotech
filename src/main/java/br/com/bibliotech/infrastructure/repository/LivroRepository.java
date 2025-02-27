package br.com.bibliotech.infrastructure.repository;

import br.com.bibliotech.domain.model.Livro;
import jakarta.persistence.*;

import java.util.List;
import java.util.Optional;

// Camada intermediária entre Camada de Domínio e Camada de Persistência (aqui utilizamos JPQL)
public class LivroRepository {
    private final EntityManager entityManager;

    public LivroRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void salvar(Livro livro) {
        entityManager.getTransaction().begin();
        entityManager.persist(livro);
        entityManager.getTransaction().commit();
    }

    // Opcional para evitar retornos nulos
    public Optional<Livro> buscaISBN(String isbn) {
        // Typed é utilizado para assegurar o tipo do retorno
        TypedQuery<Livro> query = entityManager.createQuery(
                "SELECT l FROM Livro l WHERE l.isbn = :isbn", Livro.class
        );
        query.setParameter("isbn", isbn);
        return query.getResultStream().findFirst();
    }

    public List<Livro> listarTodos() {
        return entityManager.createQuery("SELECT l FROM Livro l", Livro.class).getResultList();
    }
}
