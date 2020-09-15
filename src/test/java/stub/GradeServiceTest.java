package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GradeServiceTest {

    @Mock
    GradeSystem mockGradeSystem;

    @InjectMocks
    GradeService gradeService;

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        when(mockGradeSystem.gradesFor(1))
                .thenReturn(Arrays.asList(80.0, 90.0, 100.0));
        double result = gradeService.calculateAverageGrades(1);
        Assertions.assertEquals(90.0, result);
    }
}
