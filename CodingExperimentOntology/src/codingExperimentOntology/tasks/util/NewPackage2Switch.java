/**
 */
package codingExperimentOntology.tasks.util;

import codingExperimentOntology.tasks.*;

import experimentOntology.operation.ContextRelatedTask;
import experimentOntology.operation.ExperimentalTasks;
import experimentOntology.operation.PreTasks;

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
 * @see codingExperimentOntology.tasks.NewPackage2Package
 * @generated
 */
public class NewPackage2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NewPackage2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewPackage2Switch() {
		if (modelPackage == null) {
			modelPackage = NewPackage2Package.eINSTANCE;
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
			case NewPackage2Package.CODING_TASK: {
				CodingTask codingTask = (CodingTask)theEObject;
				T result = caseCodingTask(codingTask);
				if (result == null) result = caseExperimentalTasks(codingTask);
				if (result == null) result = caseContextRelatedTask(codingTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage2Package.CONVENTIONAL_CODING_TASK: {
				ConventionalCodingTask conventionalCodingTask = (ConventionalCodingTask)theEObject;
				T result = caseConventionalCodingTask(conventionalCodingTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage2Package.GENERIC_CODING_TASK: {
				GenericCodingTask genericCodingTask = (GenericCodingTask)theEObject;
				T result = caseGenericCodingTask(genericCodingTask);
				if (result == null) result = caseCodingTask(genericCodingTask);
				if (result == null) result = caseExperimentalTasks(genericCodingTask);
				if (result == null) result = caseContextRelatedTask(genericCodingTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage2Package.CODING_PRE_TASK: {
				CodingPreTask codingPreTask = (CodingPreTask)theEObject;
				T result = caseCodingPreTask(codingPreTask);
				if (result == null) result = casePreTasks(codingPreTask);
				if (result == null) result = caseContextRelatedTask(codingPreTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage2Package.TRAINING_CLASS: {
				TrainingClass trainingClass = (TrainingClass)theEObject;
				T result = caseTrainingClass(trainingClass);
				if (result == null) result = caseCodingPreTask(trainingClass);
				if (result == null) result = casePreTasks(trainingClass);
				if (result == null) result = caseContextRelatedTask(trainingClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage2Package.PILOT_TASK: {
				PilotTask pilotTask = (PilotTask)theEObject;
				T result = casePilotTask(pilotTask);
				if (result == null) result = caseCodingPreTask(pilotTask);
				if (result == null) result = caseConventionalCodingTask(pilotTask);
				if (result == null) result = casePreTasks(pilotTask);
				if (result == null) result = caseContextRelatedTask(pilotTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewPackage2Package.EXPERIMENTAL_CODING_TASK: {
				ExperimentalCodingTask experimentalCodingTask = (ExperimentalCodingTask)theEObject;
				T result = caseExperimentalCodingTask(experimentalCodingTask);
				if (result == null) result = caseConventionalCodingTask(experimentalCodingTask);
				if (result == null) result = caseCodingTask(experimentalCodingTask);
				if (result == null) result = caseExperimentalTasks(experimentalCodingTask);
				if (result == null) result = caseContextRelatedTask(experimentalCodingTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coding Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coding Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodingTask(CodingTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conventional Coding Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conventional Coding Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConventionalCodingTask(ConventionalCodingTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Coding Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Coding Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericCodingTask(GenericCodingTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coding Pre Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coding Pre Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodingPreTask(CodingPreTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Training Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Training Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrainingClass(TrainingClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pilot Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pilot Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePilotTask(PilotTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experimental Coding Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experimental Coding Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentalCodingTask(ExperimentalCodingTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Related Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Related Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextRelatedTask(ContextRelatedTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experimental Tasks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experimental Tasks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentalTasks(ExperimentalTasks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Tasks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Tasks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreTasks(PreTasks object) {
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

} //NewPackage2Switch
