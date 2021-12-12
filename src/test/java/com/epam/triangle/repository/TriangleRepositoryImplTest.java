package com.epam.triangle.repository;

import com.epam.triangle.entity.Point;
import com.epam.triangle.entity.Triangle;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleRepositoryImplTest {


    Point aFirstTriangle = new Point(1, 1);
    Point bFirstTriangle = new Point(7, 1);
    Point cFirstTriangle = new Point(3, 7);

    Point aSecondTriangle = new Point(1, 1);
    Point bSecondTriangle = new Point(1, 1);
    Point cSecondTriangle = new Point(1, 1);


    private final TriangleIdentifiable TRIANGLE_FIRST = new TriangleIdentifiable(1, "First",aFirstTriangle, bFirstTriangle, cFirstTriangle);
    private final TriangleIdentifiable TRIANGLE_SECOND = new TriangleIdentifiable(2, "Second",aSecondTriangle, bSecondTriangle, cSecondTriangle);

    @Test
    public void testQueryShouldReturnTriangleWhenTriangleFitsSpecification() {
        //given
        TriangleRepositoryImp triangleRepository = new TriangleRepositoryImp();
        triangleRepository.add(TRIANGLE_FIRST);
        Specification specification = Mockito.mock(Specification.class);
        Mockito.when(specification.specified(TRIANGLE_FIRST)).thenReturn(true);
        List<TriangleIdentifiable> expectedQuery = Arrays.asList(TRIANGLE_FIRST);
        //when
        List<TriangleIdentifiable> actualQuery = triangleRepository.query(specification);
        //then
        assertEquals(expectedQuery, actualQuery);

    }

    @Test
    public void testQueryShouldReturnTriangleWhenTriangleDoesNotFitSpecification() {
        //given
        TriangleRepositoryImp triangleRepository = new TriangleRepositoryImp();
        triangleRepository.add(TRIANGLE_FIRST);

        Specification specification = Mockito.mock(Specification.class);
        Mockito.when(specification.specified(TRIANGLE_FIRST)).thenReturn(false);
        List<TriangleIdentifiable> expectedQuery = Arrays.asList();
        //when
        List<TriangleIdentifiable> actualQuery = triangleRepository.query(specification);
        //then
        assertEquals(expectedQuery, actualQuery);

    }

    @Test
    public void testQueryShouldSortTrianglesById() {
        // given
        final TriangleRepository repository = new TriangleRepositoryImp();
        repository.add(TRIANGLE_SECOND);
        repository.add(TRIANGLE_FIRST);
        Comparator<TriangleIdentifiable> idComparator = Mockito.mock(Comparator.class);
        Mockito.when(idComparator.compare(TRIANGLE_FIRST, TRIANGLE_SECOND)).thenReturn(-1);
        List<TriangleIdentifiable> expectedQuery = Arrays.asList(TRIANGLE_FIRST, TRIANGLE_SECOND);
        // when
        List<TriangleIdentifiable> actualQuery = repository.sort(idComparator);
        // then
        assertEquals(expectedQuery, actualQuery);
    }

    @Test
    public void testQueryShouldSortDataByName() {
        // given
        final TriangleRepository repository = new TriangleRepositoryImp();
        repository.add(TRIANGLE_SECOND);
        repository.add(TRIANGLE_FIRST);
        Comparator<TriangleIdentifiable> nameComparator = Mockito.mock(Comparator.class);
        Mockito.when(nameComparator.compare(TRIANGLE_FIRST, TRIANGLE_SECOND)).thenReturn(-1);
        List<TriangleIdentifiable> expectedQuery = Arrays.asList(TRIANGLE_FIRST, TRIANGLE_SECOND);
        // when
        List<TriangleIdentifiable> actualQuery = repository.sort(nameComparator);
        // then
        assertEquals(expectedQuery, actualQuery);
    }

    @Test
    public void testQueryShouldSortDataByFirstPointXCoordinate() {
        // given
        final TriangleRepository repository = new TriangleRepositoryImp();
        repository.add(TRIANGLE_FIRST);
        repository.add(TRIANGLE_SECOND);
        Comparator<TriangleIdentifiable> firstTrianfleComparator = Mockito.mock(Comparator.class);
        Mockito.when(firstTrianfleComparator.compare(TRIANGLE_FIRST, TRIANGLE_SECOND))
                .thenReturn(1);
        List<TriangleIdentifiable> expectedQuery = Arrays.asList(TRIANGLE_FIRST,
                TRIANGLE_SECOND);
        // when
        List<TriangleIdentifiable> actualQuery = repository.sort(firstTrianfleComparator);
        // then
       assertEquals(expectedQuery, actualQuery);
    }

    @Test
    public void testQueryShouldReturnTrianglesWhenAreaInGivenRange() {
        // given
        final TriangleRepository repository = new TriangleRepositoryImp();
        repository.add(TRIANGLE_FIRST);
        repository.add(TRIANGLE_SECOND);
        AreaSpecification specification = Mockito.mock(AreaSpecification.class);
        Mockito.when(specification.specified(TRIANGLE_FIRST)).thenReturn(false);
        Mockito.when(specification.specified(TRIANGLE_SECOND)).thenReturn(true);
        List<TriangleIdentifiable> expectedQuery = Arrays.asList(TRIANGLE_SECOND);

        // when
        List<TriangleIdentifiable> actualQuery = repository.query(specification);

        // then
        assertEquals(expectedQuery, actualQuery);
    }


    @Test
    public void testQueryShouldReturnTrianglesWhenFirstPointIsInTheFirstQuadrant() {
        // given
        final TriangleRepository repository = new TriangleRepositoryImp();
        repository.add(TRIANGLE_SECOND);
        repository.add(TRIANGLE_FIRST);
        FirstQuadrantSpecification specification = Mockito.mock(FirstQuadrantSpecification.class);
        Mockito.when(specification.specified(TRIANGLE_SECOND)).thenReturn(true);
        Mockito.when(specification.specified(TRIANGLE_FIRST)).thenReturn(true);
        List<TriangleIdentifiable> expectedQuery = Arrays.asList(TRIANGLE_FIRST,TRIANGLE_SECOND);
        // when
        List<TriangleIdentifiable> actualQuery = repository.query(specification);
        // then
       assertEquals(expectedQuery, actualQuery);
    }


}

