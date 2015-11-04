/**
 */
package codingExperimentOntology.apparatus.impl;

import codingExperimentOntology.apparatus.NewPackage4Package;
import codingExperimentOntology.apparatus.TaskRelated;

import codingExperimentOntology.tasks.CodingTask;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Related</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.apparatus.impl.TaskRelatedImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TaskRelatedImpl extends MinimalEObjectImpl.Container implements TaskRelated {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<CodingTask> task;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskRelatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage4Package.Literals.TASK_RELATED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodingTask> getTask() {
		if (task == null) {
			task = new EObjectResolvingEList<CodingTask>(CodingTask.class, this, NewPackage4Package.TASK_RELATED__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NewPackage4Package.TASK_RELATED__TASK:
				return getTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NewPackage4Package.TASK_RELATED__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends CodingTask>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NewPackage4Package.TASK_RELATED__TASK:
				getTask().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NewPackage4Package.TASK_RELATED__TASK:
				return task != null && !task.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskRelatedImpl
