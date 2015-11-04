/**
 */
package experimentOntology.planning.util;

import experimentOntology.planning.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see experimentOntology.planning.PlanningPackage
 * @generated
 */
public class PlanningAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlanningPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanningAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PlanningPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanningSwitch<Adapter> modelSwitch =
		new PlanningSwitch<Adapter>() {
			@Override
			public Adapter caseDependentVariable(DependentVariable object) {
				return createDependentVariableAdapter();
			}
			@Override
			public Adapter caseExperimentalPlan(ExperimentalPlan object) {
				return createExperimentalPlanAdapter();
			}
			@Override
			public Adapter caseIndependentVariable(IndependentVariable object) {
				return createIndependentVariableAdapter();
			}
			@Override
			public Adapter caseApparatus(Apparatus object) {
				return createApparatusAdapter();
			}
			@Override
			public Adapter caseArtifact(Artifact object) {
				return createArtifactAdapter();
			}
			@Override
			public Adapter caseInstrument(Instrument object) {
				return createInstrumentAdapter();
			}
			@Override
			public Adapter caseFactor(Factor object) {
				return createFactorAdapter();
			}
			@Override
			public Adapter caseDualTreatmentFactor(DualTreatmentFactor object) {
				return createDualTreatmentFactorAdapter();
			}
			@Override
			public Adapter caseMultiTreatmentFactor(MultiTreatmentFactor object) {
				return createMultiTreatmentFactorAdapter();
			}
			@Override
			public Adapter caseTreatment(Treatment object) {
				return createTreatmentAdapter();
			}
			@Override
			public Adapter caseMonoFactorTreatmentPlan(MonoFactorTreatmentPlan object) {
				return createMonoFactorTreatmentPlanAdapter();
			}
			@Override
			public Adapter caseDualFactorPlan(DualFactorPlan object) {
				return createDualFactorPlanAdapter();
			}
			@Override
			public Adapter caseTernaryFactorPlan(TernaryFactorPlan object) {
				return createTernaryFactorPlanAdapter();
			}
			@Override
			public Adapter caseGenericPlan(GenericPlan object) {
				return createGenericPlanAdapter();
			}
			@Override
			public Adapter caseMonoFactorMultTreatmentPlan(MonoFactorMultTreatmentPlan object) {
				return createMonoFactorMultTreatmentPlanAdapter();
			}
			@Override
			public Adapter caseExperimentalPlanDescription(ExperimentalPlanDescription object) {
				return createExperimentalPlanDescriptionAdapter();
			}
			@Override
			public Adapter casePiecesOfApparatus(PiecesOfApparatus object) {
				return createPiecesOfApparatusAdapter();
			}
			@Override
			public Adapter caseIndependentVariables(IndependentVariables object) {
				return createIndependentVariablesAdapter();
			}
			@Override
			public Adapter caseDependentVariables(DependentVariables object) {
				return createDependentVariablesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.DependentVariable <em>Dependent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.DependentVariable
	 * @generated
	 */
	public Adapter createDependentVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.ExperimentalPlan <em>Experimental Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.ExperimentalPlan
	 * @generated
	 */
	public Adapter createExperimentalPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.IndependentVariable <em>Independent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.IndependentVariable
	 * @generated
	 */
	public Adapter createIndependentVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.Apparatus <em>Apparatus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.Apparatus
	 * @generated
	 */
	public Adapter createApparatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.Instrument <em>Instrument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.Instrument
	 * @generated
	 */
	public Adapter createInstrumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.Factor
	 * @generated
	 */
	public Adapter createFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.DualTreatmentFactor <em>Dual Treatment Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.DualTreatmentFactor
	 * @generated
	 */
	public Adapter createDualTreatmentFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.MultiTreatmentFactor <em>Multi Treatment Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.MultiTreatmentFactor
	 * @generated
	 */
	public Adapter createMultiTreatmentFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.Treatment <em>Treatment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.Treatment
	 * @generated
	 */
	public Adapter createTreatmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.MonoFactorTreatmentPlan <em>Mono Factor Treatment Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.MonoFactorTreatmentPlan
	 * @generated
	 */
	public Adapter createMonoFactorTreatmentPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.DualFactorPlan <em>Dual Factor Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.DualFactorPlan
	 * @generated
	 */
	public Adapter createDualFactorPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.TernaryFactorPlan <em>Ternary Factor Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.TernaryFactorPlan
	 * @generated
	 */
	public Adapter createTernaryFactorPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.GenericPlan <em>Generic Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.GenericPlan
	 * @generated
	 */
	public Adapter createGenericPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.MonoFactorMultTreatmentPlan <em>Mono Factor Mult Treatment Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.MonoFactorMultTreatmentPlan
	 * @generated
	 */
	public Adapter createMonoFactorMultTreatmentPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.ExperimentalPlanDescription <em>Experimental Plan Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.ExperimentalPlanDescription
	 * @generated
	 */
	public Adapter createExperimentalPlanDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.PiecesOfApparatus <em>Pieces Of Apparatus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.PiecesOfApparatus
	 * @generated
	 */
	public Adapter createPiecesOfApparatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.IndependentVariables <em>Independent Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.IndependentVariables
	 * @generated
	 */
	public Adapter createIndependentVariablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link experimentOntology.planning.DependentVariables <em>Dependent Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see experimentOntology.planning.DependentVariables
	 * @generated
	 */
	public Adapter createDependentVariablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PlanningAdapterFactory
