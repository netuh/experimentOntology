/**
 */
package experimentOntology.operation.impl;

import experimentOntology.operation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationFactoryImpl extends EFactoryImpl implements OperationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperationFactory init() {
		try {
			OperationFactory theOperationFactory = (OperationFactory)EPackage.Registry.INSTANCE.getEFactory(OperationPackage.eNS_URI);
			if (theOperationFactory != null) {
				return theOperationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OperationPackage.COMMON_EXECUTION_PLAN: return createCommonExecutionPlan();
			case OperationPackage.INDEPENDENT_EXECUTION_PLAN: return createIndependentExecutionPlan();
			case OperationPackage.EXECUTION_PLAN_BY_TREATMENT: return createExecutionPlanByTreatment();
			case OperationPackage.PRE_EXECUTION_PLAN: return createPreExecutionPlan();
			case OperationPackage.CONTEXT: return createContext();
			case OperationPackage.EXECUTION_PLAN_DESCRIPTION: return createExecutionPlanDescription();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonExecutionPlan createCommonExecutionPlan() {
		CommonExecutionPlanImpl commonExecutionPlan = new CommonExecutionPlanImpl();
		return commonExecutionPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndependentExecutionPlan createIndependentExecutionPlan() {
		IndependentExecutionPlanImpl independentExecutionPlan = new IndependentExecutionPlanImpl();
		return independentExecutionPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionPlanByTreatment createExecutionPlanByTreatment() {
		ExecutionPlanByTreatmentImpl executionPlanByTreatment = new ExecutionPlanByTreatmentImpl();
		return executionPlanByTreatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreExecutionPlan createPreExecutionPlan() {
		PreExecutionPlanImpl preExecutionPlan = new PreExecutionPlanImpl();
		return preExecutionPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionPlanDescription createExecutionPlanDescription() {
		ExecutionPlanDescriptionImpl executionPlanDescription = new ExecutionPlanDescriptionImpl();
		return executionPlanDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationPackage getOperationPackage() {
		return (OperationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OperationPackage getPackage() {
		return OperationPackage.eINSTANCE;
	}

} //OperationFactoryImpl
