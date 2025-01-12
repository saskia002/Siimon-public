package siimon.core.api.module.klass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import siimon.core.api.module.klass.model.ClassModel;
import siimon.core.api.module.klass.model.ClassTeacherModel;
import siimon.core.api.module.klass.model.TeacherModel;

@Repository
public interface ClassTeacherRepository extends JpaRepository<ClassTeacherModel, Integer> {

	ClassTeacherModel findByClassModelAndTeacherModel(ClassModel classModel, TeacherModel teacherModel);

}
