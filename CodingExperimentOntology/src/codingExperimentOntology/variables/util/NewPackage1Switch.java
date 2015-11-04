/**
 */
package codingExperimentOntology.variables.util;

import codingExperimentOntology.variables.*;

import experimentOntology.planning.DependentVariable;
import experimentOntology.planning.IndependentVariable;

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
 * @see codingExperimentOntology.variables.NewPackage1Package
 * @generated
 */
public class NewPackage1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NewPackage1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage1Switch() {
		if (modelPackage == null) {
			modelPackage = NewPackage1Package.eINSTANCE;
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
			case NewPackage1Package.CODING_DEPENDENT_VARIABLE: {
				CodingDependentVariable codingDependentVariable = (CodingDependentVariable)theEObject;
				T result = caseCodingDependentVariable(codingDependentVariable);
				if (result == null) result = caseDependentVariable(codingDependentVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage1Package.CODING_INDEPENDENT_VARIABLE: {
				CodingIndependentVariable codingIndependentVariable = (CodingIndependentVariable)theEObject;
				T result = caseCodingIndependentVariable(codingIndependentVariable);
				if (result == null) result = caseIndependentVariable(codingIndependentVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage1Package.TIME_BOUND_VARIABLE: {
				TimeBoundVariable timeBoundVariable = (TimeBoundVariable)theEObject;
				T result = caseTimeBoundVariable(timeBoundVariable);
				if (result == null) result = caseCodingDependentVariable(timeBoundVariable);
				if (result == null) result = caseDependentVariable(timeBoundVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage1Package.RESOURCE_BASED_VARIABLE: {
				ResourceBasedVariable resourceBasedVariable = (ResourceBasedVariable)theEObject;
				T result = caseResourceBasedVariable(resourceBasedVariable);
				if (result == null) result = caseTimeBoundVariable(resourceBasedVariable);
				if (result == null) result = caseCodingDependentVariable(resourceBasedVariable);
				if (result == null) result = caseDependentVariable(resourceBasedVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage1Package.AWNSER_BASED_VARIABLE: {
				AwnserBasedVariable awnserBasedVariable = (AwnserBasedVariable)theEObject;
				T result = caseAwnserBasedVariable(awnserBasedVariable);
				if (result == null) result = caseTimeBoundVariable(awnserBasedVariable);
				if (result == null) result = caseCodingDependentVariable(awnserBasedVariable);
				if (result == null) result = caseDependentVariable(awnserBasedVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage1Package.ARTIFACT_INDEPENDENT_VARIABLE: {
				ArtifactIndependentVariable artifactIndependentVariable = (ArtifactIndependentVariable)theEObject;
				T result = caseArtifactIndependentVariable(artifactIndependentVariable);
				if (result == null) result = caseCodingIndependentVariable(artifactIndependentVariable);
				if (result == null) result = caseIndependentVariable(artifactIndependentVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage1Package.ENVIROMENT_INDEPENDENT_VARIABLE: {
				EnviromentIndependentVariable enviromentIndependentVariable = (EnviromentIndependentVariable)theEObject;
				T result = caseEnviromentIndependentVariable(enviromentIndependentVariable);
				if (result == null) result = caseCodingIndependentVariable(enviromentIndependentVariable);
				if (result == null) result = caseIndependentVariable(enviromentIndependentVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage1Package.OTHER_CODING_VARIABLE: {
				OtherCodingVariable otherCodingVariable = (OtherCodingVariable)theEObject;
				T result = caseOtherCodingVariable(otherCodingVariable);
				if (result == null) result = caseCodingIndependentVariable(otherCodingVariable);
				if (result == null) result = caseIndependentVariable(otherCodingVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coding Dependent Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coding Dependent Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodingDependentVariable(CodingDependentVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coding Independent Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coding Independent Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodingIndependentVariable(CodingIndependentVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Bound Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Bound Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeBoundVariable(TimeBoundVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Based Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Based Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceBasedVariable(ResourceBasedVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Awnser Based Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Awnser Based Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwnserBasedVariable(AwnserBasedVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Independent Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Independent Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactIndependentVariable(ArtifactIndependentVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enviroment Independent Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enviroment Independent Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnviromentIndependentVariable(EnviromentIndependentVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Coding Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Coding Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherCodingVariable(OtherCodingVariable object) {
		return null;
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

} //NewPackage1Switch
