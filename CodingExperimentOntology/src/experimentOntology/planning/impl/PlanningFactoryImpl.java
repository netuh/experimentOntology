/**
 */
package experimentOntology.planning.impl;

import experimentOntology.planning.*;

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
public class PlanningFactoryImpl extends EFactoryImpl implements PlanningFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlanningFactory init() {
		try {
			PlanningFactory thePlanningFactory = (PlanningFactory)EPackage.Registry.INSTANCE.getEFactory(PlanningPackage.eNS_URI);
			if (thePlanningFactory != null) {
				return thePlanningFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlanningFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanningFactoryImpl() {
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
			case PlanningPackage.DUAL_TREATMENT_FACTOR: return createDualTreatmentFactor();
			case PlanningPackage.MULTI_TREATMENT_FACTOR: return createMultiTreatmentFactor();
			case PlanningPackage.TREATMENT: return createTreatment();
			case PlanningPackage.MONO_FACTOR_TREATMENT_PLAN: return createMonoFactorTreatmentPlan();
			case PlanningPackage.DUAL_FACTOR_PLAN: return createDualFactorPlan();
			case PlanningPackage.TERNARY_FACTOR_PLAN: return createTernaryFactorPlan();
			case PlanningPackage.GENERIC_PLAN: return createGenericPlan();
			case PlanningPackage.MONO_FACTOR_MULT_TREATMENT_PLAN: return createMonoFactorMultTreatmentPlan();
			case PlanningPackage.EXPERIMENTAL_PLAN_DESCRIPTION: return createExperimentalPlanDescription();
			case PlanningPackage.PIECES_OF_APPARATUS: return createPiecesOfApparatus();
			case PlanningPackage.INDEPENDENT_VARIABLES: return createIndependentVariables();
			case PlanningPackage.DEPENDENT_VARIABLES: return createDependentVariables();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DualTreatmentFactor createDualTreatmentFactor() {
		DualTreatmentFactorImpl dualTreatmentFactor = new DualTreatmentFactorImpl();
		return dualTreatmentFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiTreatmentFactor createMultiTreatmentFactor() {
		MultiTreatmentFactorImpl multiTreatmentFactor = new MultiTreatmentFactorImpl();
		return multiTreatmentFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Treatment createTreatment() {
		TreatmentImpl treatment = new TreatmentImpl();
		return treatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonoFactorTreatmentPlan createMonoFactorTreatmentPlan() {
		MonoFactorTreatmentPlanImpl monoFactorTreatmentPlan = new MonoFactorTreatmentPlanImpl();
		return monoFactorTreatmentPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DualFactorPlan createDualFactorPlan() {
		DualFactorPlanImpl dualFactorPlan = new DualFactorPlanImpl();
		return dualFactorPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TernaryFactorPlan createTernaryFactorPlan() {
		TernaryFactorPlanImpl ternaryFactorPlan = new TernaryFactorPlanImpl();
		return ternaryFactorPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericPlan createGenericPlan() {
		GenericPlanImpl genericPlan = new GenericPlanImpl();
		return genericPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonoFactorMultTreatmentPlan createMonoFactorMultTreatmentPlan() {
		MonoFactorMultTreatmentPlanImpl monoFactorMultTreatmentPlan = new MonoFactorMultTreatmentPlanImpl();
		return monoFactorMultTreatmentPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentalPlanDescription createExperimentalPlanDescription() {
		ExperimentalPlanDescriptionImpl experimentalPlanDescription = new ExperimentalPlanDescriptionImpl();
		return experimentalPlanDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PiecesOfApparatus createPiecesOfApparatus() {
		PiecesOfApparatusImpl piecesOfApparatus = new PiecesOfApparatusImpl();
		return piecesOfApparatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndependentVariables createIndependentVariables() {
		IndependentVariablesImpl independentVariables = new IndependentVariablesImpl();
		return independentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependentVariables createDependentVariables() {
		DependentVariablesImpl dependentVariables = new DependentVariablesImpl();
		return dependentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanningPackage getPlanningPackage() {
		return (PlanningPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlanningPackage getPackage() {
		return PlanningPackage.eINSTANCE;
	}

} //PlanningFactoryImpl
