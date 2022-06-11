package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bp = new BishopBlack(Cell.D5);
        assertThat(bp.position(), is(Cell.D5));
    }

    @Test
    public void copy() {
        BishopBlack bp = new BishopBlack(Cell.D5);
        Figure pb = bp.copy(Cell.E6);
        assertThat(pb.position(), is(Cell.E6));
    }

    @Test
    public void way() {
        BishopBlack bp = new BishopBlack(Cell.C1);
        assertThat(bp.way(Cell.G5), is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void wayCheck() {
        BishopBlack bp = new BishopBlack(Cell.C1);
        bp.way(Cell.C2);
    }
}