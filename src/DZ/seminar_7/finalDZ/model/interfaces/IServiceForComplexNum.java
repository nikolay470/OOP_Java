package DZ.seminar_7.finalDZ.model.interfaces;

import DZ.seminar_7.finalDZ.model.ComplexNumber;

public interface IServiceForComplexNum {
    ComplexNumber sum(ComplexNumber first, ComplexNumber second);
    ComplexNumber subtraction(ComplexNumber first, ComplexNumber second);
    ComplexNumber division(ComplexNumber first, ComplexNumber second);
    ComplexNumber multipliucation(ComplexNumber first, ComplexNumber second);
}
