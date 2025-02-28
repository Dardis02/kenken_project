package test.java.it.utente.kenken.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import main.java.it.utente.kenken.model.Cell;
public class CellTest {

    @Test
    void testCellInitialization() { //test sui valori iniziali: riga=0, colonna=1, valore=0
        Cell cell = new Cell(0, 1);
        assertEquals(0, cell.getRow());
        assertEquals(1, cell.getCol());
        assertEquals(0, cell.getValue());
    }

    @Test
    void testSetValue() {  //verifica che la cella aggiorna correttemnte il suo valore
        Cell cell = new Cell(2,2); //crea una cella in posizione 2,2
        cell.setValue(5);
        assertEquals(5, cell.getValue());
    }

    @Test
    void testInvalidCoordinates() {
        // Verifica che il costruttore lanci un'eccezione quando vengono passate coordinate negative
        assertThrows(IllegalArgumentException.class, () -> {
            new Cell(-1, 2);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Cell(2, -1);
        });
    }
}
