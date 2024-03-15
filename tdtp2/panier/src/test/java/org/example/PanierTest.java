package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PanierTest {

    Panier panier;

    @BeforeEach
    void setUp() {
         panier = new Panier(new GestionDeStock("Gestion de stock"), new Comptabilite("Comptabilite"));
    }

    @Test
    void test_get_contenu_equals_contenu_du_panier() {
        assertEquals("Contenu du panier", panier.getContenu());
    }



}