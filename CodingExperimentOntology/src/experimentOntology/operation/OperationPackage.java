/**
 */
package experimentOntology.operation;

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
 * @see experimentOntology.operation.OperationFactory
 * @model kind="package"
 * @generated
 */
public interface OperationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "operation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/operation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "operation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperationPackage eINSTANCE = experimentOntology.operation.impl.OperationPackageImpl.init();

	/**
	 * The meta object id for the '{@link experimentOntology.operation.impl.ExecutionPlanImpl <em>Execution Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.operation.impl.ExecutionPlanImpl
	 * @see experimentOntology.operation.impl.OperationPackageImpl#getExecutionPlan()
	 * @generated
	 */
	int EXECUTION_PLAN = 0;

	/**
	 * The number of structural features of the '<em>Execution Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLAN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Execution Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.operation.impl.CommonExecutionPlanImpl <em>Common Execution Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.operation.impl.CommonExecutionPlanImpl
	 * @see experimentOntology.operation.impl.OperationPackageImpl#getCommonExecutionPlan()
	 * @generated
	 */
	int COMMON_EXECUTION_PLAN = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_EXECUTION_PLAN__TASKS = EXECUTION_PLAN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Common Execution Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_EXECUTION_PLAN_FEATURE_COUNT = EXECUTION_PLAN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Common Execution Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_EXECUTION_PLAN_OPERATION_COUNT = EXECUTION_PLAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.operation.impl.IndependentExecutionPlanImpl <em>Independent Execution Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.operation.impl.IndependentExecutionPlanImpl
	 * @see experimentOntology.operation.impl.OperationPackageImpl#getIndependentExecutionPlan()
	 * @generated
	 */
	int INDEPENDENT_EXECUTION_PLAN = 2;

	/**
	 * The feature id for the '<em><b>Plan By Treatment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENT_EXECUTION_PLAN__PLAN_BY_TREATMENT = EXECUTION_PLAN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Independent Execution Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENT_EXECUTION_PLAN_FEATURE_COUNT = EXECUTION_PLAN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Independent Execution Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEPENDENT_EXECUTION_PLAN_OPERATION_COUNT = EXECUTION_PLAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.operation.impl.ExecutionPlanByTreatmentImpl <em>Execution Plan By Treatment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.operation.impl.ExecutionPlanByTreatmentImpl
	 * @see experimentOntology.operation.impl.OperationPackageImpl#getExecutionPlanByTreatment()
	 * @generated
	 */
	int EXECUTION_PLAN_BY_TREATMENT = 3;

	/**
	 * The feature id for the '<em><b>Treatment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLAN_BY_TREATMENT__TREATMENT = 0;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLAN_BY_TREATMENT__PLAN = 1;

	/**
	 * The number of structural features of the '<em>Execution Plan By Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLAN_BY_TREATMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Execution Plan By Treatment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLAN_BY_TREATMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.operation.impl.PreExecutionPlanImpl <em>Pre Execution Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.operation.impl.PreExecutionPlanImpl
	 * @see experimentOntology.operation.impl.OperationPackageImpl#getPreExecutionPlan()
	 * @generated
	 */
	int PRE_EXECUTION_PLAN = 4;

	/**
	 * The feature id for the '<em><b>Pretasks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_EXECUTION_PLAN__PRETASKS = 0;

	/**
	 * The number of structural features of the '<em>Pre Execution Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_EXECUTION_PLAN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pre Execution Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_EXECUTION_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.operation.impl.ContextRelatedTaskImpl <em>Context Related Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.operation.impl.ContextRelatedTaskImpl
	 * @see experimentOntology.operation.impl.OperationPackageImpl#getContextRelatedTask()
	 * @generated
	 */
	int CONTEXT_RELATED_TASK = 9;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_RELATED_TASK__CONTEXT = 0;

	/**
	 * The number of structural features of the '<em>Context Related Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_RELATED_TASK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Context Related Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_RELATED_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.operation.impl.PreTasksImpl <em>Pre Tasks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.operation.impl.PreTasksImpl
	 * @see experimentOntology.operation.impl.OperationPackageImpl#getPreTasks()
	 * @generated
	 */
	int PRE_TASKS = 5;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TASKS__CONTEXT = CONTEXT_RELATED_TASK__CONTEXT;

	/**
	 * The number of structural features of the '<em>Pre Tasks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TASKS_FEATURE_COUNT = CONTEXT_RELATED_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pre Tasks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TASKS_OPERATION_COUNT = CONTEXT_RELATED_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.operation.impl.ExperimentalTasksImpl <em>Experimental Tasks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.operation.impl.ExperimentalTasksImpl
	 * @see experimentOntology.operation.impl.OperationPackageImpl#getExperimentalTasks()
	 * @generated
	 */
	int EXPERIMENTAL_TASKS = 6;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASKS__CONTEXT = CONTEXT_RELATED_TASK__CONTEXT;

	/**
	 * The number of structural features of the '<em>Experimental Tasks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASKS_FEATURE_COUNT = CONTEXT_RELATED_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Experimental Tasks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTAL_TASKS_OPERATION_COUNT = CONTEXT_RELATED_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link experimentOntology.operation.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.operation.impl.ContextImpl
	 * @see experimentOntology.operation.impl.OperationPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 7;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PROVIDED = 0;

	/**
	 * The feature id for the '<em><b>Instruments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__INSTRUMENTS = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__REQUIRED = 2;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link experimentOntology.operation.impl.ExecutionPlanDescriptionImpl <em>Execution Plan Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see experimentOntology.operation.impl.ExecutionPlanDescriptionImpl
	 * @see experimentOntology.operation.impl.OperationPackageImpl#getExecutionPlanDescription()
	 * @generated
	 */
	int EXECUTION_PLAN_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLAN_DESCRIPTION__PLAN = 0;

	/**
	 * The feature id for the '<em><b>Pre Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLAN_DESCRIPTION__PRE_PLAN = 1;

	/**
	 * The number of structural features of the '<em>Execution Plan Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLAN_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Execution Plan Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_PLAN_DESCRIPTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link experimentOntology.operation.ExecutionPlan <em>Execution Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Plan</em>'.
	 * @see experimentOntology.operation.ExecutionPlan
	 * @generated
	 */
	EClass getExecutionPlan();

	/**
	 * Returns the meta object for class '{@link experimentOntology.operation.CommonExecutionPlan <em>Common Execution Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Execution Plan</em>'.
	 * @see experimentOntology.operation.CommonExecutionPlan
	 * @generated
	 */
	EClass getCommonExecutionPlan();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.operation.CommonExecutionPlan#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tasks</em>'.
	 * @see experimentOntology.operation.CommonExecutionPlan#getTasks()
	 * @see #getCommonExecutionPlan()
	 * @generated
	 */
	EReference getCommonExecutionPlan_Tasks();

	/**
	 * Returns the meta object for class '{@link experimentOntology.operation.IndependentExecutionPlan <em>Independent Execution Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Independent Execution Plan</em>'.
	 * @see experimentOntology.operation.IndependentExecutionPlan
	 * @generated
	 */
	EClass getIndependentExecutionPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link experimentOntology.operation.IndependentExecutionPlan#getPlanByTreatment <em>Plan By Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plan By Treatment</em>'.
	 * @see experimentOntology.operation.IndependentExecutionPlan#getPlanByTreatment()
	 * @see #getIndependentExecutionPlan()
	 * @generated
	 */
	EReference getIndependentExecutionPlan_PlanByTreatment();

	/**
	 * Returns the meta object for class '{@link experimentOntology.operation.ExecutionPlanByTreatment <em>Execution Plan By Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Plan By Treatment</em>'.
	 * @see experimentOntology.operation.ExecutionPlanByTreatment
	 * @generated
	 */
	EClass getExecutionPlanByTreatment();

	/**
	 * Returns the meta object for the reference '{@link experimentOntology.operation.ExecutionPlanByTreatment#getTreatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Treatment</em>'.
	 * @see experimentOntology.operation.ExecutionPlanByTreatment#getTreatment()
	 * @see #getExecutionPlanByTreatment()
	 * @generated
	 */
	EReference getExecutionPlanByTreatment_Treatment();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.operation.ExecutionPlanByTreatment#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan</em>'.
	 * @see experimentOntology.operation.ExecutionPlanByTreatment#getPlan()
	 * @see #getExecutionPlanByTreatment()
	 * @generated
	 */
	EReference getExecutionPlanByTreatment_Plan();

	/**
	 * Returns the meta object for class '{@link experimentOntology.operation.PreExecutionPlan <em>Pre Execution Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Execution Plan</em>'.
	 * @see experimentOntology.operation.PreExecutionPlan
	 * @generated
	 */
	EClass getPreExecutionPlan();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.operation.PreExecutionPlan#getPretasks <em>Pretasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pretasks</em>'.
	 * @see experimentOntology.operation.PreExecutionPlan#getPretasks()
	 * @see #getPreExecutionPlan()
	 * @generated
	 */
	EReference getPreExecutionPlan_Pretasks();

	/**
	 * Returns the meta object for class '{@link experimentOntology.operation.PreTasks <em>Pre Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Tasks</em>'.
	 * @see experimentOntology.operation.PreTasks
	 * @generated
	 */
	EClass getPreTasks();

	/**
	 * Returns the meta object for class '{@link experimentOntology.operation.ExperimentalTasks <em>Experimental Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimental Tasks</em>'.
	 * @see experimentOntology.operation.ExperimentalTasks
	 * @generated
	 */
	EClass getExperimentalTasks();

	/**
	 * Returns the meta object for class '{@link experimentOntology.operation.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see experimentOntology.operation.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the reference list '{@link experimentOntology.operation.Context#getProvided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided</em>'.
	 * @see experimentOntology.operation.Context#getProvided()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Provided();

	/**
	 * Returns the meta object for the reference list '{@link experimentOntology.operation.Context#getInstruments <em>Instruments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instruments</em>'.
	 * @see experimentOntology.operation.Context#getInstruments()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Instruments();

	/**
	 * Returns the meta object for the reference list '{@link experimentOntology.operation.Context#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required</em>'.
	 * @see experimentOntology.operation.Context#getRequired()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Required();

	/**
	 * Returns the meta object for class '{@link experimentOntology.operation.ExecutionPlanDescription <em>Execution Plan Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Plan Description</em>'.
	 * @see experimentOntology.operation.ExecutionPlanDescription
	 * @generated
	 */
	EClass getExecutionPlanDescription();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.operation.ExecutionPlanDescription#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan</em>'.
	 * @see experimentOntology.operation.ExecutionPlanDescription#getPlan()
	 * @see #getExecutionPlanDescription()
	 * @generated
	 */
	EReference getExecutionPlanDescription_Plan();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.operation.ExecutionPlanDescription#getPrePlan <em>Pre Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Plan</em>'.
	 * @see experimentOntology.operation.ExecutionPlanDescription#getPrePlan()
	 * @see #getExecutionPlanDescription()
	 * @generated
	 */
	EReference getExecutionPlanDescription_PrePlan();

	/**
	 * Returns the meta object for class '{@link experimentOntology.operation.ContextRelatedTask <em>Context Related Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Related Task</em>'.
	 * @see experimentOntology.operation.ContextRelatedTask
	 * @generated
	 */
	EClass getContextRelatedTask();

	/**
	 * Returns the meta object for the containment reference '{@link experimentOntology.operation.ContextRelatedTask#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see experimentOntology.operation.ContextRelatedTask#getContext()
	 * @see #getContextRelatedTask()
	 * @generated
	 */
	EReference getContextRelatedTask_Context();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OperationFactory getOperationFactory();

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
		 * The meta object literal for the '{@link experimentOntology.operation.impl.ExecutionPlanImpl <em>Execution Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.operation.impl.ExecutionPlanImpl
		 * @see experimentOntology.operation.impl.OperationPackageImpl#getExecutionPlan()
		 * @generated
		 */
		EClass EXECUTION_PLAN = eINSTANCE.getExecutionPlan();

		/**
		 * The meta object literal for the '{@link experimentOntology.operation.impl.CommonExecutionPlanImpl <em>Common Execution Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.operation.impl.CommonExecutionPlanImpl
		 * @see experimentOntology.operation.impl.OperationPackageImpl#getCommonExecutionPlan()
		 * @generated
		 */
		EClass COMMON_EXECUTION_PLAN = eINSTANCE.getCommonExecutionPlan();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_EXECUTION_PLAN__TASKS = eINSTANCE.getCommonExecutionPlan_Tasks();

		/**
		 * The meta object literal for the '{@link experimentOntology.operation.impl.IndependentExecutionPlanImpl <em>Independent Execution Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.operation.impl.IndependentExecutionPlanImpl
		 * @see experimentOntology.operation.impl.OperationPackageImpl#getIndependentExecutionPlan()
		 * @generated
		 */
		EClass INDEPENDENT_EXECUTION_PLAN = eINSTANCE.getIndependentExecutionPlan();

		/**
		 * The meta object literal for the '<em><b>Plan By Treatment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEPENDENT_EXECUTION_PLAN__PLAN_BY_TREATMENT = eINSTANCE.getIndependentExecutionPlan_PlanByTreatment();

		/**
		 * The meta object literal for the '{@link experimentOntology.operation.impl.ExecutionPlanByTreatmentImpl <em>Execution Plan By Treatment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.operation.impl.ExecutionPlanByTreatmentImpl
		 * @see experimentOntology.operation.impl.OperationPackageImpl#getExecutionPlanByTreatment()
		 * @generated
		 */
		EClass EXECUTION_PLAN_BY_TREATMENT = eINSTANCE.getExecutionPlanByTreatment();

		/**
		 * The meta object literal for the '<em><b>Treatment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_PLAN_BY_TREATMENT__TREATMENT = eINSTANCE.getExecutionPlanByTreatment_Treatment();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_PLAN_BY_TREATMENT__PLAN = eINSTANCE.getExecutionPlanByTreatment_Plan();

		/**
		 * The meta object literal for the '{@link experimentOntology.operation.impl.PreExecutionPlanImpl <em>Pre Execution Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.operation.impl.PreExecutionPlanImpl
		 * @see experimentOntology.operation.impl.OperationPackageImpl#getPreExecutionPlan()
		 * @generated
		 */
		EClass PRE_EXECUTION_PLAN = eINSTANCE.getPreExecutionPlan();

		/**
		 * The meta object literal for the '<em><b>Pretasks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_EXECUTION_PLAN__PRETASKS = eINSTANCE.getPreExecutionPlan_Pretasks();

		/**
		 * The meta object literal for the '{@link experimentOntology.operation.impl.PreTasksImpl <em>Pre Tasks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.operation.impl.PreTasksImpl
		 * @see experimentOntology.operation.impl.OperationPackageImpl#getPreTasks()
		 * @generated
		 */
		EClass PRE_TASKS = eINSTANCE.getPreTasks();

		/**
		 * The meta object literal for the '{@link experimentOntology.operation.impl.ExperimentalTasksImpl <em>Experimental Tasks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.operation.impl.ExperimentalTasksImpl
		 * @see experimentOntology.operation.impl.OperationPackageImpl#getExperimentalTasks()
		 * @generated
		 */
		EClass EXPERIMENTAL_TASKS = eINSTANCE.getExperimentalTasks();

		/**
		 * The meta object literal for the '{@link experimentOntology.operation.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.operation.impl.ContextImpl
		 * @see experimentOntology.operation.impl.OperationPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Provided</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__PROVIDED = eINSTANCE.getContext_Provided();

		/**
		 * The meta object literal for the '<em><b>Instruments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__INSTRUMENTS = eINSTANCE.getContext_Instruments();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__REQUIRED = eINSTANCE.getContext_Required();

		/**
		 * The meta object literal for the '{@link experimentOntology.operation.impl.ExecutionPlanDescriptionImpl <em>Execution Plan Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.operation.impl.ExecutionPlanDescriptionImpl
		 * @see experimentOntology.operation.impl.OperationPackageImpl#getExecutionPlanDescription()
		 * @generated
		 */
		EClass EXECUTION_PLAN_DESCRIPTION = eINSTANCE.getExecutionPlanDescription();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_PLAN_DESCRIPTION__PLAN = eINSTANCE.getExecutionPlanDescription_Plan();

		/**
		 * The meta object literal for the '<em><b>Pre Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_PLAN_DESCRIPTION__PRE_PLAN = eINSTANCE.getExecutionPlanDescription_PrePlan();

		/**
		 * The meta object literal for the '{@link experimentOntology.operation.impl.ContextRelatedTaskImpl <em>Context Related Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see experimentOntology.operation.impl.ContextRelatedTaskImpl
		 * @see experimentOntology.operation.impl.OperationPackageImpl#getContextRelatedTask()
		 * @generated
		 */
		EClass CONTEXT_RELATED_TASK = eINSTANCE.getContextRelatedTask();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_RELATED_TASK__CONTEXT = eINSTANCE.getContextRelatedTask_Context();

	}

} //OperationPackage
