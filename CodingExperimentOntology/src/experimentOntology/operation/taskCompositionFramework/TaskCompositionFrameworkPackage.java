/**
 */
package experimentOntology.operation.taskCompositionFramework;

import experimentOntology.operation.OperationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see experimentOntology.operation.taskCompositionFramework.TaskCompositionFrameworkFactory
 * @model kind="package"
 * @generated
 */
public interface TaskCompositionFrameworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "taskCompositionFramework";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "taskCompositionFramework";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "taskCompositionFramework";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskCompositionFrameworkPackage eINSTANCE = experimentOntology.operation.taskCompositionFramework.impl.TaskCompositionFrameworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link experimentOntology.operation.taskCompositionFramework.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.operation.taskCompositionFramework.impl.TaskImpl
	 * @see experimentOntology.operation.taskCompositionFramework.impl.TaskCompositionFrameworkPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONTEXT = OperationPackage.PRE_TASKS__CONTEXT;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = OperationPackage.PRE_TASKS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = OperationPackage.PRE_TASKS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.operation.taskCompositionFramework.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.operation.taskCompositionFramework.impl.SequenceImpl
	 * @see experimentOntology.operation.taskCompositionFramework.impl.TaskCompositionFrameworkPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__CONTEXT = TASK__CONTEXT;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TASK = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.operation.taskCompositionFramework.impl.RandomImpl <em>Random</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.operation.taskCompositionFramework.impl.RandomImpl
	 * @see experimentOntology.operation.taskCompositionFramework.impl.TaskCompositionFrameworkPackageImpl#getRandom()
	 * @generated
	 */
	int RANDOM = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM__CONTEXT = TASK__CONTEXT;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM__TASK = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Random</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Random</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.operation.taskCompositionFramework.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.operation.taskCompositionFramework.impl.IfImpl
	 * @see experimentOntology.operation.taskCompositionFramework.impl.TaskCompositionFrameworkPackageImpl#getIf()
	 * @generated
	 */
	int IF = 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONTEXT = TASK__CONTEXT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elseif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSEIF = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__TASK = TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = TASK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.operation.taskCompositionFramework.impl.ElseIfImpl <em>Else If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.operation.taskCompositionFramework.impl.ElseIfImpl
	 * @see experimentOntology.operation.taskCompositionFramework.impl.TaskCompositionFrameworkPackageImpl#getElseIf()
	 * @generated
	 */
	int ELSE_IF = 4;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF__TASK = 0;

	/**
	 * The number of structural features of the '<em>Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link experimentOntology.operation.taskCompositionFramework.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see experimentOntology.operation.taskCompositionFramework.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link experimentOntology.operation.taskCompositionFramework.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see experimentOntology.operation.taskCompositionFramework.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.operation.taskCompositionFramework.Sequence#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see experimentOntology.operation.taskCompositionFramework.Sequence#getTask()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Task();

	/**
	 * Returns the meta object for class '{@link experimentOntology.operation.taskCompositionFramework.Random <em>Random</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random</em>'.
	 * @see experimentOntology.operation.taskCompositionFramework.Random
	 * @generated
	 */
	EClass getRandom();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.operation.taskCompositionFramework.Random#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see experimentOntology.operation.taskCompositionFramework.Random#getTask()
	 * @see #getRandom()
	 * @generated
	 */
	EReference getRandom_Task();

	/**
	 * Returns the meta object for class '{@link experimentOntology.operation.taskCompositionFramework.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see experimentOntology.operation.taskCompositionFramework.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the attribute '{@link experimentOntology.operation.taskCompositionFramework.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see experimentOntology.operation.taskCompositionFramework.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EAttribute getIf_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.operation.taskCompositionFramework.If#getElseif <em>Elseif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elseif</em>'.
	 * @see experimentOntology.operation.taskCompositionFramework.If#getElseif()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Elseif();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.operation.taskCompositionFramework.If#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task</em>'.
	 * @see experimentOntology.operation.taskCompositionFramework.If#getTask()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Task();

	/**
	 * Returns the meta object for class '{@link experimentOntology.operation.taskCompositionFramework.ElseIf <em>Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else If</em>'.
	 * @see experimentOntology.operation.taskCompositionFramework.ElseIf
	 * @generated
	 */
	EClass getElseIf();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.operation.taskCompositionFramework.ElseIf#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task</em>'.
	 * @see experimentOntology.operation.taskCompositionFramework.ElseIf#getTask()
	 * @see #getElseIf()
	 * @generated
	 */
	EReference getElseIf_Task();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaskCompositionFrameworkFactory getTaskCompositionFrameworkFactory();

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
		 * The meta object literal for the '{@link experimentOntology.operation.taskCompositionFramework.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.operation.taskCompositionFramework.impl.TaskImpl
		 * @see experimentOntology.operation.taskCompositionFramework.impl.TaskCompositionFrameworkPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link experimentOntology.operation.taskCompositionFramework.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.operation.taskCompositionFramework.impl.SequenceImpl
		 * @see experimentOntology.operation.taskCompositionFramework.impl.TaskCompositionFrameworkPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__TASK = eINSTANCE.getSequence_Task();

		/**
		 * The meta object literal for the '{@link experimentOntology.operation.taskCompositionFramework.impl.RandomImpl <em>Random</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.operation.taskCompositionFramework.impl.RandomImpl
		 * @see experimentOntology.operation.taskCompositionFramework.impl.TaskCompositionFrameworkPackageImpl#getRandom()
		 * @generated
		 */
		EClass RANDOM = eINSTANCE.getRandom();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANDOM__TASK = eINSTANCE.getRandom_Task();

		/**
		 * The meta object literal for the '{@link experimentOntology.operation.taskCompositionFramework.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.operation.taskCompositionFramework.impl.IfImpl
		 * @see experimentOntology.operation.taskCompositionFramework.impl.TaskCompositionFrameworkPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF__CONDITION = eINSTANCE.getIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Elseif</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELSEIF = eINSTANCE.getIf_Elseif();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__TASK = eINSTANCE.getIf_Task();

		/**
		 * The meta object literal for the '{@link experimentOntology.operation.taskCompositionFramework.impl.ElseIfImpl <em>Else If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.operation.taskCompositionFramework.impl.ElseIfImpl
		 * @see experimentOntology.operation.taskCompositionFramework.impl.TaskCompositionFrameworkPackageImpl#getElseIf()
		 * @generated
		 */
		EClass ELSE_IF = eINSTANCE.getElseIf();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_IF__TASK = eINSTANCE.getElseIf_Task();

	}

} //TaskCompositionFrameworkPackage
