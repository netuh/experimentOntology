/**
 */
package experimentOntology.planning.util;

import experimentOntology.planning.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see experimentOntology.planning.PlanningPackage
 * @generated
 */
public class PlanningSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlanningPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanningSwitch() {
		if (modelPackage == null) {
			modelPackage = PlanningPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PlanningPackage.DEPENDENT_VARIABLE: {
				DependentVariable dependentVariable = (DependentVariable)theEObject;
				T result = caseDependentVariable(dependentVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.EXPERIMENTAL_PLAN: {
				ExperimentalPlan experimentalPlan = (ExperimentalPlan)theEObject;
				T result = caseExperimentalPlan(experimentalPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.INDEPENDENT_VARIABLE: {
				IndependentVariable independentVariable = (IndependentVariable)theEObject;
				T result = caseIndependentVariable(independentVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.APPARATUS: {
				Apparatus apparatus = (Apparatus)theEObject;
				T result = caseApparatus(apparatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.ARTIFACT: {
				Artifact artifact = (Artifact)theEObject;
				T result = caseArtifact(artifact);
				if (result == null) result = caseApparatus(artifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.INSTRUMENT: {
				Instrument instrument = (Instrument)theEObject;
				T result = caseInstrument(instrument);
				if (result == null) result = caseApparatus(instrument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.FACTOR: {
				Factor factor = (Factor)theEObject;
				T result = caseFactor(factor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.DUAL_TREATMENT_FACTOR: {
				DualTreatmentFactor dualTreatmentFactor = (DualTreatmentFactor)theEObject;
				T result = caseDualTreatmentFactor(dualTreatmentFactor);
				if (result == null) result = caseFactor(dualTreatmentFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.MULTI_TREATMENT_FACTOR: {
				MultiTreatmentFactor multiTreatmentFactor = (MultiTreatmentFactor)theEObject;
				T result = caseMultiTreatmentFactor(multiTreatmentFactor);
				if (result == null) result = caseFactor(multiTreatmentFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.TREATMENT: {
				Treatment treatment = (Treatment)theEObject;
				T result = caseTreatment(treatment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.MONO_FACTOR_TREATMENT_PLAN: {
				MonoFactorTreatmentPlan monoFactorTreatmentPlan = (MonoFactorTreatmentPlan)theEObject;
				T result = caseMonoFactorTreatmentPlan(monoFactorTreatmentPlan);
				if (result == null) result = caseExperimentalPlan(monoFactorTreatmentPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.DUAL_FACTOR_PLAN: {
				DualFactorPlan dualFactorPlan = (DualFactorPlan)theEObject;
				T result = caseDualFactorPlan(dualFactorPlan);
				if (result == null) result = caseExperimentalPlan(dualFactorPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.TERNARY_FACTOR_PLAN: {
				TernaryFactorPlan ternaryFactorPlan = (TernaryFactorPlan)theEObject;
				T result = caseTernaryFactorPlan(ternaryFactorPlan);
				if (result == null) result = caseExperimentalPlan(ternaryFactorPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.GENERIC_PLAN: {
				GenericPlan genericPlan = (GenericPlan)theEObject;
				T result = caseGenericPlan(genericPlan);
				if (result == null) result = caseExperimentalPlan(genericPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.MONO_FACTOR_MULT_TREATMENT_PLAN: {
				MonoFactorMultTreatmentPlan monoFactorMultTreatmentPlan = (MonoFactorMultTreatmentPlan)theEObject;
				T result = caseMonoFactorMultTreatmentPlan(monoFactorMultTreatmentPlan);
				if (result == null) result = caseExperimentalPlan(monoFactorMultTreatmentPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.EXPERIMENTAL_PLAN_DESCRIPTION: {
				ExperimentalPlanDescription experimentalPlanDescription = (ExperimentalPlanDescription)theEObject;
				T result = caseExperimentalPlanDescription(experimentalPlanDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.PIECES_OF_APPARATUS: {
				PiecesOfApparatus piecesOfApparatus = (PiecesOfApparatus)theEObject;
				T result = casePiecesOfApparatus(piecesOfApparatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.INDEPENDENT_VARIABLES: {
				IndependentVariables independentVariables = (IndependentVariables)theEObject;
				T result = caseIndependentVariables(independentVariables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PlanningPackage.DEPENDENT_VARIABLES: {
				DependentVariables dependentVariables = (DependentVariables)theEObject;
				T result = caseDependentVariables(dependentVariables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependent Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependent Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependentVariable(DependentVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experimental Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experimental Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentalPlan(ExperimentalPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Independent Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Independent Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndependentVariable(IndependentVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apparatus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apparatus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApparatus(Apparatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instrument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instrument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstrument(Instrument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactor(Factor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dual Treatment Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dual Treatment Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDualTreatmentFactor(DualTreatmentFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Treatment Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Treatment Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiTreatmentFactor(MultiTreatmentFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Treatment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Treatment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreatment(Treatment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mono Factor Treatment Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mono Factor Treatment Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonoFactorTreatmentPlan(MonoFactorTreatmentPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dual Factor Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dual Factor Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDualFactorPlan(DualFactorPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ternary Factor Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ternary Factor Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTernaryFactorPlan(TernaryFactorPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericPlan(GenericPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mono Factor Mult Treatment Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mono Factor Mult Treatment Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonoFactorMultTreatmentPlan(MonoFactorMultTreatmentPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experimental Plan Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experimental Plan Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentalPlanDescription(ExperimentalPlanDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pieces Of Apparatus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pieces Of Apparatus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePiecesOfApparatus(PiecesOfApparatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Independent Variables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Independent Variables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndependentVariables(IndependentVariables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependent Variables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependent Variables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependentVariables(DependentVariables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PlanningSwitch
