/**
 */
package codingExperimentOntology.tasks;

import experimentOntology.operation.OperationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see codingExperimentOntology.tasks.NewPackage2Factory
 * @model kind="package"
 * @generated
 */
public interface NewPackage2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tasks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "tasks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tasks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NewPackage2Package eINSTANCE = codingExperimentOntology.tasks.impl.NewPackage2PackageImpl.init();

	/**
	 * The meta object id for the '{@link codingExperimentOntology.tasks.impl.CodingTaskImpl <em>Coding Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.tasks.impl.CodingTaskImpl
	 * @see codingExperimentOntology.tasks.impl.NewPackage2PackageImpl#getCodingTask()
	 * @generated
	 */
	int CODING_TASK = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_TASK__CONTEXT = OperationPackage.EXPERIMENTAL_TASKS__CONTEXT;

	/**
	 * The number of structural features of the '<em>Coding Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_TASK_FEATURE_COUNT = OperationPackage.EXPERIMENTAL_TASKS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coding Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_TASK_OPERATION_COUNT = OperationPackage.EXPERIMENTAL_TASKS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.tasks.impl.ConventionalCodingTaskImpl <em>Conventional Coding Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.tasks.impl.ConventionalCodingTaskImpl
	 * @see codingExperimentOntology.tasks.impl.NewPackage2PackageImpl#getConventionalCodingTask()
	 * @generated
	 */
	int CONVENTIONAL_CODING_TASK = 1;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVENTIONAL_CODING_TASK__TASK_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Required Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVENTIONAL_CODING_TASK__REQUIRED_ARTIFACT = 1;

	/**
	 * The feature id for the '<em><b>Produced Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVENTIONAL_CODING_TASK__PRODUCED_ARTIFACT = 2;

	/**
	 * The number of structural features of the '<em>Conventional Coding Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVENTIONAL_CODING_TASK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Conventional Coding Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVENTIONAL_CODING_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.tasks.impl.GenericCodingTaskImpl <em>Generic Coding Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.tasks.impl.GenericCodingTaskImpl
	 * @see codingExperimentOntology.tasks.impl.NewPackage2PackageImpl#getGenericCodingTask()
	 * @generated
	 */
	int GENERIC_CODING_TASK = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CODING_TASK__CONTEXT = CODING_TASK__CONTEXT;

	/**
	 * The number of structural features of the '<em>Generic Coding Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CODING_TASK_FEATURE_COUNT = CODING_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generic Coding Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CODING_TASK_OPERATION_COUNT = CODING_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.tasks.impl.CodingPreTaskImpl <em>Coding Pre Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.tasks.impl.CodingPreTaskImpl
	 * @see codingExperimentOntology.tasks.impl.NewPackage2PackageImpl#getCodingPreTask()
	 * @generated
	 */
	int CODING_PRE_TASK = 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_PRE_TASK__CONTEXT = OperationPackage.PRE_TASKS__CONTEXT;

	/**
	 * The number of structural features of the '<em>Coding Pre Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_PRE_TASK_FEATURE_COUNT = OperationPackage.PRE_TASKS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coding Pre Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_PRE_TASK_OPERATION_COUNT = OperationPackage.PRE_TASKS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.tasks.impl.TrainingClassImpl <em>Training Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.tasks.impl.TrainingClassImpl
	 * @see codingExperimentOntology.tasks.impl.NewPackage2PackageImpl#getTrainingClass()
	 * @generated
	 */
	int TRAINING_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_CLASS__CONTEXT = CODING_PRE_TASK__CONTEXT;

	/**
	 * The number of structural features of the '<em>Training Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_CLASS_FEATURE_COUNT = CODING_PRE_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Training Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_CLASS_OPERATION_COUNT = CODING_PRE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.tasks.impl.PilotTaskImpl <em>Pilot Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.tasks.impl.PilotTaskImpl
	 * @see codingExperimentOntology.tasks.impl.NewPackage2PackageImpl#getPilotTask()
	 * @generated
	 */
	int PILOT_TASK = 5;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PILOT_TASK__CONTEXT = CODING_PRE_TASK__CONTEXT;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PILOT_TASK__TASK_TYPE = CODING_PRE_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PILOT_TASK__REQUIRED_ARTIFACT = CODING_PRE_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Produced Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PILOT_TASK__PRODUCED_ARTIFACT = CODING_PRE_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pilot Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PILOT_TASK_FEATURE_COUNT = CODING_PRE_TASK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pilot Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PILOT_TASK_OPERATION_COUNT = CODING_PRE_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.tasks.impl.ExperimentalCodingTaskImpl <em>Experimental Coding Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.tasks.impl.ExperimentalCodingTaskImpl
	 * @see codingExperimentOntology.tasks.impl.NewPackage2PackageImpl#getExperimentalCodingTask()
	 * @generated
	 */
	int EXPERIMENTAL_CODING_TASK = 6;

	/**
	 * The feature id for the '<em><b>Task Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_CODING_TASK__TASK_TYPE = CONVENTIONAL_CODING_TASK__TASK_TYPE;

	/**
	 * The feature id for the '<em><b>Required Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_CODING_TASK__REQUIRED_ARTIFACT = CONVENTIONAL_CODING_TASK__REQUIRED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Produced Artifact</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_CODING_TASK__PRODUCED_ARTIFACT = CONVENTIONAL_CODING_TASK__PRODUCED_ARTIFACT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_CODING_TASK__CONTEXT = CONVENTIONAL_CODING_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Experimental Coding Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_CODING_TASK_FEATURE_COUNT = CONVENTIONAL_CODING_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Experimental Coding Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_CODING_TASK_OPERATION_COUNT = CONVENTIONAL_CODING_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link codingExperimentOntology.tasks.CodingTaskTypes <em>Coding Task Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see codingExperimentOntology.tasks.CodingTaskTypes
	 * @see codingExperimentOntology.tasks.impl.NewPackage2PackageImpl#getCodingTaskTypes()
	 * @generated
	 */
	int CODING_TASK_TYPES = 7;


	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.tasks.CodingTask <em>Coding Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coding Task</em>'.
	 * @see codingExperimentOntology.tasks.CodingTask
	 * @generated
	 */
	EClass getCodingTask();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.tasks.ConventionalCodingTask <em>Conventional Coding Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conventional Coding Task</em>'.
	 * @see codingExperimentOntology.tasks.ConventionalCodingTask
	 * @generated
	 */
	EClass getConventionalCodingTask();

	/**
	 * Returns the meta object for the attribute '{@link codingExperimentOntology.tasks.ConventionalCodingTask#getTaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Type</em>'.
	 * @see codingExperimentOntology.tasks.ConventionalCodingTask#getTaskType()
	 * @see #getConventionalCodingTask()
	 * @generated
	 */
	EAttribute getConventionalCodingTask_TaskType();

	/**
	 * Returns the meta object for the reference list '{@link codingExperimentOntology.tasks.ConventionalCodingTask#getRequiredArtifact <em>Required Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Artifact</em>'.
	 * @see codingExperimentOntology.tasks.ConventionalCodingTask#getRequiredArtifact()
	 * @see #getConventionalCodingTask()
	 * @generated
	 */
	EReference getConventionalCodingTask_RequiredArtifact();

	/**
	 * Returns the meta object for the reference list '{@link codingExperimentOntology.tasks.ConventionalCodingTask#getProducedArtifact <em>Produced Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produced Artifact</em>'.
	 * @see codingExperimentOntology.tasks.ConventionalCodingTask#getProducedArtifact()
	 * @see #getConventionalCodingTask()
	 * @generated
	 */
	EReference getConventionalCodingTask_ProducedArtifact();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.tasks.GenericCodingTask <em>Generic Coding Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Coding Task</em>'.
	 * @see codingExperimentOntology.tasks.GenericCodingTask
	 * @generated
	 */
	EClass getGenericCodingTask();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.tasks.CodingPreTask <em>Coding Pre Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coding Pre Task</em>'.
	 * @see codingExperimentOntology.tasks.CodingPreTask
	 * @generated
	 */
	EClass getCodingPreTask();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.tasks.TrainingClass <em>Training Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training Class</em>'.
	 * @see codingExperimentOntology.tasks.TrainingClass
	 * @generated
	 */
	EClass getTrainingClass();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.tasks.PilotTask <em>Pilot Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pilot Task</em>'.
	 * @see codingExperimentOntology.tasks.PilotTask
	 * @generated
	 */
	EClass getPilotTask();

	/**
	 * Returns the meta object for class '{@link codingExperimentOntology.tasks.ExperimentalCodingTask <em>Experimental Coding Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimental Coding Task</em>'.
	 * @see codingExperimentOntology.tasks.ExperimentalCodingTask
	 * @generated
	 */
	EClass getExperimentalCodingTask();

	/**
	 * Returns the meta object for enum '{@link codingExperimentOntology.tasks.CodingTaskTypes <em>Coding Task Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coding Task Types</em>'.
	 * @see codingExperimentOntology.tasks.CodingTaskTypes
	 * @generated
	 */
	EEnum getCodingTaskTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NewPackage2Factory getNewPackage2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link codingExperimentOntology.tasks.impl.CodingTaskImpl <em>Coding Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.tasks.impl.CodingTaskImpl
		 * @see codingExperimentOntology.tasks.impl.NewPackage2PackageImpl#getCodingTask()
		 * @generated
		 */
		EClass CODING_TASK = eINSTANCE.getCodingTask();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.tasks.impl.ConventionalCodingTaskImpl <em>Conventional Coding Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.tasks.impl.ConventionalCodingTaskImpl
		 * @see codingExperimentOntology.tasks.impl.NewPackage2PackageImpl#getConventionalCodingTask()
		 * @generated
		 */
		EClass CONVENTIONAL_CODING_TASK = eINSTANCE.getConventionalCodingTask();

		/**
		 * The meta object literal for the '<em><b>Task Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVENTIONAL_CODING_TASK__TASK_TYPE = eINSTANCE.getConventionalCodingTask_TaskType();

		/**
		 * The meta object literal for the '<em><b>Required Artifact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVENTIONAL_CODING_TASK__REQUIRED_ARTIFACT = eINSTANCE.getConventionalCodingTask_RequiredArtifact();

		/**
		 * The meta object literal for the '<em><b>Produced Artifact</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVENTIONAL_CODING_TASK__PRODUCED_ARTIFACT = eINSTANCE.getConventionalCodingTask_ProducedArtifact();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.tasks.impl.GenericCodingTaskImpl <em>Generic Coding Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.tasks.impl.GenericCodingTaskImpl
		 * @see codingExperimentOntology.tasks.impl.NewPackage2PackageImpl#getGenericCodingTask()
		 * @generated
		 */
		EClass GENERIC_CODING_TASK = eINSTANCE.getGenericCodingTask();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.tasks.impl.CodingPreTaskImpl <em>Coding Pre Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.tasks.impl.CodingPreTaskImpl
		 * @see codingExperimentOntology.tasks.impl.NewPackage2PackageImpl#getCodingPreTask()
		 * @generated
		 */
		EClass CODING_PRE_TASK = eINSTANCE.getCodingPreTask();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.tasks.impl.TrainingClassImpl <em>Training Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.tasks.impl.TrainingClassImpl
		 * @see codingExperimentOntology.tasks.impl.NewPackage2PackageImpl#getTrainingClass()
		 * @generated
		 */
		EClass TRAINING_CLASS = eINSTANCE.getTrainingClass();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.tasks.impl.PilotTaskImpl <em>Pilot Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.tasks.impl.PilotTaskImpl
		 * @see codingExperimentOntology.tasks.impl.NewPackage2PackageImpl#getPilotTask()
		 * @generated
		 */
		EClass PILOT_TASK = eINSTANCE.getPilotTask();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.tasks.impl.ExperimentalCodingTaskImpl <em>Experimental Coding Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.tasks.impl.ExperimentalCodingTaskImpl
		 * @see codingExperimentOntology.tasks.impl.NewPackage2PackageImpl#getExperimentalCodingTask()
		 * @generated
		 */
		EClass EXPERIMENTAL_CODING_TASK = eINSTANCE.getExperimentalCodingTask();

		/**
		 * The meta object literal for the '{@link codingExperimentOntology.tasks.CodingTaskTypes <em>Coding Task Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see codingExperimentOntology.tasks.CodingTaskTypes
		 * @see codingExperimentOntology.tasks.impl.NewPackage2PackageImpl#getCodingTaskTypes()
		 * @generated
		 */
		EEnum CODING_TASK_TYPES = eINSTANCE.getCodingTaskTypes();

	}

} //NewPackage2Package
