/**
 */
package experimentOntology.planning.designOfExperiment.util;

import experimentOntology.planning.designOfExperiment.*;

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
 * @see experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage
 * @generated
 */
public class DesignOfExperimentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DesignOfExperimentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignOfExperimentSwitch() {
		if (modelPackage == null) {
			modelPackage = DesignOfExperimentPackage.eINSTANCE;
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
			case DesignOfExperimentPackage.DESIGN_TYPE: {
				DesignType designType = (DesignType)theEObject;
				T result = caseDesignType(designType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignOfExperimentPackage.DESIGN_DISCIPLINE: {
				DesignDiscipline designDiscipline = (DesignDiscipline)theEObject;
				T result = caseDesignDiscipline(designDiscipline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignOfExperimentPackage.RANDOMIZED_DISCIPLINE: {
				RandomizedDiscipline randomizedDiscipline = (RandomizedDiscipline)theEObject;
				T result = caseRandomizedDiscipline(randomizedDiscipline);
				if (result == null) result = caseDesignDiscipline(randomizedDiscipline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignOfExperimentPackage.BLOCK_DESIGN_DISCIPLINE: {
				BlockDesignDiscipline blockDesignDiscipline = (BlockDesignDiscipline)theEObject;
				T result = caseBlockDesignDiscipline(blockDesignDiscipline);
				if (result == null) result = caseDesignDiscipline(blockDesignDiscipline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignOfExperimentPackage.BALANCED_DESIGN_DISCIPLINE: {
				BalancedDesignDiscipline balancedDesignDiscipline = (BalancedDesignDiscipline)theEObject;
				T result = caseBalancedDesignDiscipline(balancedDesignDiscipline);
				if (result == null) result = caseBlockDesignDiscipline(balancedDesignDiscipline);
				if (result == null) result = caseDesignDiscipline(balancedDesignDiscipline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignOfExperimentPackage.BLOCKED_CHARACTERISTIC: {
				BlockedCharacteristic blockedCharacteristic = (BlockedCharacteristic)theEObject;
				T result = caseBlockedCharacteristic(blockedCharacteristic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignOfExperimentPackage.ONE_FACTOR_DESIGN: {
				OneFactorDesign oneFactorDesign = (OneFactorDesign)theEObject;
				T result = caseOneFactorDesign(oneFactorDesign);
				if (result == null) result = caseDesignType(oneFactorDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignOfExperimentPackage.TWO_TREATMENT_DESIGN: {
				TwoTreatmentDesign twoTreatmentDesign = (TwoTreatmentDesign)theEObject;
				T result = caseTwoTreatmentDesign(twoTreatmentDesign);
				if (result == null) result = caseOneFactorDesign(twoTreatmentDesign);
				if (result == null) result = caseDesignType(twoTreatmentDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignOfExperimentPackage.MULT_TREATMENT_DESIGN: {
				MultTreatmentDesign multTreatmentDesign = (MultTreatmentDesign)theEObject;
				T result = caseMultTreatmentDesign(multTreatmentDesign);
				if (result == null) result = caseOneFactorDesign(multTreatmentDesign);
				if (result == null) result = caseDesignType(multTreatmentDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignOfExperimentPackage.TWO_FACTOR_DESIGN: {
				TwoFactorDesign twoFactorDesign = (TwoFactorDesign)theEObject;
				T result = caseTwoFactorDesign(twoFactorDesign);
				if (result == null) result = caseDesignType(twoFactorDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignOfExperimentPackage.SQUARE_DESIGN: {
				SquareDesign squareDesign = (SquareDesign)theEObject;
				T result = caseSquareDesign(squareDesign);
				if (result == null) result = caseTwoFactorDesign(squareDesign);
				if (result == null) result = caseDesignType(squareDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignOfExperimentPackage.NESTED_FACTOR_DESIGN: {
				NestedFactorDesign nestedFactorDesign = (NestedFactorDesign)theEObject;
				T result = caseNestedFactorDesign(nestedFactorDesign);
				if (result == null) result = caseTwoFactorDesign(nestedFactorDesign);
				if (result == null) result = caseDesignType(nestedFactorDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignOfExperimentPackage.TRI_FACTOR_DESIGN: {
				TriFactorDesign triFactorDesign = (TriFactorDesign)theEObject;
				T result = caseTriFactorDesign(triFactorDesign);
				if (result == null) result = caseDesignType(triFactorDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DesignOfExperimentPackage.GENERIC_DESIGN: {
				GenericDesign genericDesign = (GenericDesign)theEObject;
				T result = caseGenericDesign(genericDesign);
				if (result == null) result = caseDesignType(genericDesign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignType(DesignType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Discipline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Discipline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignDiscipline(DesignDiscipline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Randomized Discipline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Randomized Discipline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomizedDiscipline(RandomizedDiscipline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Design Discipline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Design Discipline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockDesignDiscipline(BlockDesignDiscipline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Balanced Design Discipline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Balanced Design Discipline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBalancedDesignDiscipline(BalancedDesignDiscipline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blocked Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blocked Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockedCharacteristic(BlockedCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Factor Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Factor Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneFactorDesign(OneFactorDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Two Treatment Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Two Treatment Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwoTreatmentDesign(TwoTreatmentDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mult Treatment Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mult Treatment Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultTreatmentDesign(MultTreatmentDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Two Factor Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Two Factor Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwoFactorDesign(TwoFactorDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Square Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Square Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSquareDesign(SquareDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Factor Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Factor Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedFactorDesign(NestedFactorDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tri Factor Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tri Factor Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriFactorDesign(TriFactorDesign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericDesign(GenericDesign object) {
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

} //DesignOfExperimentSwitch
